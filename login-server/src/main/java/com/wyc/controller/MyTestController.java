package com.wyc.controller;

import com.wyc.api.MyTestServiceApi;
import com.wyc.entity.Mytest;
import com.wyc.server.MyTestService;
import com.wyc.server.impl.UserStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/myTest")
public class MyTestController implements MyTestServiceApi {


    @Qualifier("myTestServiceImpl")
    @Autowired
    private MyTestService myTestService;

    @Autowired
    private UserStrategyContext userStrategyContext;

    @Override
    public String saveUser(Mytest myTest) {
        myTestService.saveUser(myTest);
        return "save-success!";
    }

    @Override
    public String strategyUser(Integer flag) {
        userStrategyContext.strategyUser(flag);
        return "车略";
    }


}
