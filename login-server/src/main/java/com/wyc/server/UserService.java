package com.wyc.server;

import com.wyc.entity.OrgUser;

import java.util.List;

public interface UserService {
    List<OrgUser> queryUserAll(Integer pageNum,Integer pageSize);
}
