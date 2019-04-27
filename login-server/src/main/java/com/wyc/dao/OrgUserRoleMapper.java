package com.wyc.dao;

import com.wyc.entity.OrgUserRole;
import java.util.List;

public interface OrgUserRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrgUserRole record);

    OrgUserRole selectByPrimaryKey(String id);

    List<OrgUserRole> selectAll();

    int updateByPrimaryKey(OrgUserRole record);
}