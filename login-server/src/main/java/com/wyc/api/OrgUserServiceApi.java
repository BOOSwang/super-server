package com.wyc.api;

import com.wyc.entity.OrgUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(
        value = "login-server"
)
public interface OrgUserServiceApi {

    @GetMapping(value = "/queryUserAll.json")
    List<OrgUser> queryUserAll(@RequestParam Integer pageNum,@RequestParam Integer pageSize);

}
