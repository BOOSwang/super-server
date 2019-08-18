package com.wyc.server.impl;

import com.wyc.server.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserStrategyContext {
    // 注入的策略
    @Autowired
    private Map<Integer, MyTestService> userStrategyMap;

    /**
     * 处理业务
     */
    public void strategyUser(Integer flag){
        MyTestService myTestService = userStrategyMap.get(flag);
        Assert.notNull(myTestService, "userService is not null");
        myTestService.saveUser(null);
    }

    @Configuration
    class UserConfig{
        @Autowired
        @Qualifier(value = "myTestServiceImplOne")
        private MyTestService myTestServiceOne;

        @Autowired
        @Qualifier(value = "myTestServiceImplTwo")
        private MyTestService myTestServiceTwo;

        /**
         * 注入bean
         */
        @Bean
        public Map<Integer, MyTestService> userStrategyServiceMap() {
            Map<Integer, MyTestService> dataMap = new HashMap<>();
            dataMap.put(1, myTestServiceOne);
            dataMap.put(2, myTestServiceTwo);
            return dataMap;
        }
    }



}
