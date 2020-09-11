package com.lfj.service.impl;

import com.lfj.entity.Role;
import com.lfj.mapper.RoleMapper;
import com.lfj.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lfj
 * @since 2020-03-02
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
