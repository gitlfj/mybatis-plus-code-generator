package com.lfj.controller;

import com.lfj.service.IPermissionService;
import com.lfj.entity.Permission;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lfj.util.response.JsonReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  permission前端控制器  RestController注解 将结果以JSON形式返回
 * </p>
 *
 * @author lfj
 * @since 2020-03-04
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    public IPermissionService permissionService;

    /**
     * 保存修改公用 POST请求方式
     * @param permission 修改或保存的对象
     * @return JsonReturn
     */
    @PostMapping("/save")
    public JsonReturn save(Permission permission) {
        if (permission.getId() != null){
            try {
                permissionService.updateById(permission);
                return JsonReturn.buildSuccess(permission, "操作成功");
            } catch (Exception e) {
                e.printStackTrace();
                return JsonReturn.buildFailure("操作失败" + e.getMessage());
            }
        }
        try {
            permissionService.save(permission);
            return JsonReturn.buildSuccess(permission, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return JsonReturn.buildFailure("操作失败" + e.getMessage());
        }

    }

    /**批量删除 支持POST GET
     * @param ids Long 类型 List 集合
     * @return JsonReturn
     */
    @RequestMapping("remove")
    public JsonReturn delete(@RequestBody List<Long> ids) {
        try {
                permissionService.removeByIds(ids);
            return JsonReturn.buildSuccess(ids, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return JsonReturn.buildFailure("操作失败" + e.getMessage());
        }
    }

    /**
     * 查询一个  支持POST GET
     *
     * @param id 查找对象的主键ID
     * @return JsonReturn
     */
    @RequestMapping("findOne")
    public JsonReturn findOne(Long id) {
        try {
            Permission permission = permissionService.getById(id);
            return JsonReturn.buildSuccess(permission, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return JsonReturn.buildFailure("操作失败" + e.getMessage());
        }
    }


    /**查询所有 支持POST GET ,未传当前页以及分页长度 则默认1页 10条数据
     * @param pageNum 当前页
     * @param pageSize 每页最大数据数
     * @return JsonReturn
     */
    @RequestMapping("findAll")
    public JsonReturn findAll(Integer pageNum, Integer pageSize) {

        if (pageNum != null && pageSize != null) {
            try {
                Page<Permission> page = permissionService.page(new Page<Permission>(pageNum, pageSize));
                return JsonReturn.buildSuccess(page, "操作成功");
            } catch (Exception e) {
                e.printStackTrace();
                return JsonReturn.buildFailure("操作失败" + e.getMessage());
            }
        }
        try {
            Page<Permission> page = permissionService.page(new Page<>());
            return JsonReturn.buildSuccess(page, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return JsonReturn.buildFailure("操作失败" + e.getMessage());
        }
    }
}
