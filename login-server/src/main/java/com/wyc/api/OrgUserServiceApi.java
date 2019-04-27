package com.wyc.api;

import com.wyc.entity.OrgUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(
        value = "login-server"
)
public interface OrgUserServiceApi {

    @RequestMapping(value = "/queryUserAll.json")
    List<OrgUser> queryUserAll();

}
