package com.wyc.controller;

import com.wyc.api.OrgUserServiceApi;
import com.wyc.entity.OrgUser;
import com.wyc.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/org/user")
public class OrgUserController implements OrgUserServiceApi {

    @Autowired
    private UserService orgUserService;

    public List<OrgUser> queryUserAll(Integer pageNum,Integer pageSize){
        return orgUserService.queryUserAll(pageNum,pageSize);
    }

}
