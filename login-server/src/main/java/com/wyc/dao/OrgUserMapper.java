package com.wyc.dao;

import com.wyc.entity.OrgUser;
import java.util.List;

public interface OrgUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrgUser record);

    OrgUser selectByPrimaryKey(String id);

    List<OrgUser> selectAll();

    int updateByPrimaryKey(OrgUser record);
}