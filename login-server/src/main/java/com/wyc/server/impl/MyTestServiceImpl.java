package com.wyc.server.impl;

import com.wyc.dao.MytestMapper;
import com.wyc.entity.Mytest;
import com.wyc.server.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service(value = "myTestServiceImpl")
public class MyTestServiceImpl implements MyTestService {

    @Autowired
    private MytestMapper mytestMapper;

    @Override
    public void saveUser(Mytest myTest) {
        Assert.notNull(myTest,"class is not null!");
        mytestMapper.insert(myTest);
    }
}
