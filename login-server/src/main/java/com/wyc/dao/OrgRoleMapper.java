package com.wyc.dao;

import com.wyc.entity.OrgRole;
import java.util.List;

public interface OrgRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrgRole record);

    OrgRole selectByPrimaryKey(String id);

    List<OrgRole> selectAll();

    int updateByPrimaryKey(OrgRole record);
}