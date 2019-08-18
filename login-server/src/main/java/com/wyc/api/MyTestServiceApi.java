package com.wyc.api;

import com.wyc.entity.Mytest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        value = "login-server"
)
public interface  MyTestServiceApi{

    @PostMapping(value = "/save-user")
    public String saveUser(@RequestBody Mytest myTest);

    @GetMapping(value = "/strategy")
    public String strategyUser(@RequestParam Integer flag);

}
