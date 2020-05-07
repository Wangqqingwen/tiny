package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台角色管理Service
 */
public interface UmsRoleService {
    /**
     * 添加角色
     * @param role
     * @return
     */
    int create(UmsRole role);

    /**
     * 修改角色信息
     * @param id
     * @param role
     * @return
     */
    int update(Long id, UmsRole role);

    /**
     * 删除角色
     * @param ids
     * @return
     */
    int delete(List<Long> ids);

    @Transactional
    int updatePermission(Long roleId, List<Long> permissionIds);

    List<UmsRole> list();

    List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

//    List<UmsMeun> getMenuList(Long adminId);
//
//    List<UmsRole>
}
