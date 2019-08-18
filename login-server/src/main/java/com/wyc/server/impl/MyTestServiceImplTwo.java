package com.wyc.server.impl;

import com.wyc.entity.Mytest;
import com.wyc.server.MyTestService;
import org.springframework.stereotype.Service;

@Service(value = "myTestServiceImplTwo")
public class MyTestServiceImplTwo implements MyTestService {
    @Override
    public void saveUser(Mytest myTest) {
        System.out.println("第二种逻辑");
    }
}
