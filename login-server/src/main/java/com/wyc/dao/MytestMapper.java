package com.wyc.dao;

import com.wyc.entity.Mytest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MytestMapper {
    int insert(Mytest record);

    List<Mytest> selectAll();
}