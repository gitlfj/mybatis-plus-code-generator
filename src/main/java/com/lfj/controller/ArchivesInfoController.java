package com.lfj.controller;

import com.lfj.service.IArchivesInfoService;
import com.lfj.entity.ArchivesInfo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lfj.util.response.JsonReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cqysxx.smartOffice.common.UserHandle;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import com.cqysxx.smartOffice.util.CheckUtils;
import com.cqysxx.smartOffice.common.Msg;


import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  archivesInfo前端控制器
 * </p>
 *
 * @author lfj
 * @since 2020-09-11 ${TIME}
 */
@RestController
@RequestMapping("/archivesInfo")
public class  ArchivesInfoController {

    @Autowired
    public IArchivesInfoService archivesInfoService;


    @Autowired
    private UserHandle userHandle;


    /**
    * 分页查询ArchivesInfo列表
    * @param vo 查询条件对象
    * @return com.cqysxx.smartOffice.common.Msg
    * @date 2020-09-11 ${TIME}
    * @author lfj
    */
    @RequestMapping("listArchivesInfo")
    public Msg listArchivesInfo(@RequestBody @Valid ArchivesInfo archivesInfo) {

        if (pageNum != null && pageSize != null) {
            try {
                Page<ArchivesInfo> page = archivesInfoService.page(new Page<>(pageNum, pageSize));
                return JsonReturn.buildSuccess(page, "操作成功");
            } catch (Exception e) {
                e.printStackTrace();
                return JsonReturn.buildFailure("操作失败" + e.getMessage());
            }
        }
        try {
            Page<ArchivesInfo> page = archivesInfoService.page(new Page<>());
            return JsonReturn.buildSuccess(page, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return JsonReturn.buildFailure("操作失败" + e.getMessage());
        }
    }

    /**
     * 保存
     * @param archivesInfo 保存的对象
     * @return com.cqysxx.smartOffice.common.Msg
     * @date 2020-09-11 ${TIME}
     */
    @PostMapping("/save")
    public Msg save(ArchivesInfo archivesInfo) {
        if (archivesInfo.getId() != null){
            try {
                archivesInfoService.updateById(archivesInfo);
                return JsonReturn.buildSuccess(archivesInfo, "操作成功");
            } catch (Exception e) {
                e.printStackTrace();
                return JsonReturn.buildFailure("操作失败" + e.getMessage());
            }
        }
        try {
            archivesInfoService.save(archivesInfo);
            return JsonReturn.buildSuccess(archivesInfo, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return JsonReturn.buildFailure("操作失败" + e.getMessage());
        }

    }

    /**
     * 修改
     * @param archivesInfo 修改的对象
     * @return JsonReturn
     */
    @PostMapping("/update")
    public Msg update(ArchivesInfo archivesInfo) {
        if (archivesInfo.getId() != null){
            try {
                    archivesInfoService.updateById(archivesInfo);
                return JsonReturn.buildSuccess(archivesInfo, "操作成功");
            } catch (Exception e) {
                e.printStackTrace();
                return JsonReturn.buildFailure("操作失败" + e.getMessage());
            }
        }
        try {
                archivesInfoService.save(archivesInfo);
            return JsonReturn.buildSuccess(archivesInfo, "操作成功");
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
    public Msg delete(@RequestBody List<Long> ids) {
        try {
            archivesInfoService.removeByIds(ids);
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
    @RequestMapping("getDetail")
    public Msg findOne(Long id) {
        try {
            ArchivesInfo archivesInfo = archivesInfoService.getById(id);
            return JsonReturn.buildSuccess(archivesInfo, "操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            return JsonReturn.buildFailure("操作失败" + e.getMessage());
        }
    }


}
