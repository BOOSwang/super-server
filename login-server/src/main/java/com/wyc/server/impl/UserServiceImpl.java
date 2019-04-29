package com.wyc.server.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyc.dao.OrgUserMapper;
import com.wyc.entity.OrgUser;
import com.wyc.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RedisTemplate redisTemplate;


    @Autowired
    private OrgUserMapper orgUserMapper;

    @Override
    public List<OrgUser> queryUserAll(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OrgUser> orgUsers = orgUserMapper.selectAll();

        List<OrgUser> user = redisTemplate.opsForList().range("user", 0, -1);

        redisTemplate.opsForList().leftPushAll("user", orgUsers);

        return orgUsers;
    }
}
