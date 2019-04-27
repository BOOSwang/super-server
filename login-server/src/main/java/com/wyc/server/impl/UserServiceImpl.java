package com.wyc.server.impl;

import com.wyc.dao.OrgUserMapper;
import com.wyc.entity.OrgUser;
import com.wyc.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private OrgUserMapper orgUserMapper;

    @Override
    public List<OrgUser> queryUserAll() {
        return orgUserMapper.selectAll();
    }
}
