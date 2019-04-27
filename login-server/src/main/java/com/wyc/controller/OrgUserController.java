package com.wyc.controller;

import com.wyc.api.OrgUserServiceApi;
import com.wyc.entity.OrgUser;
import com.wyc.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrgUserController implements OrgUserServiceApi {

    @Autowired
    private UserService orgUserService;

    public List<OrgUser> queryUserAll(){
        return orgUserService.queryUserAll();
    }

}
