package com.lfj.service.impl;

import com.lfj.entity.Permission;
import com.lfj.mapper.PermissionMapper;
import com.lfj.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lfj
 * @since 2020-03-04
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
