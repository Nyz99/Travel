package com.baizhi.travels.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDAO<T,K> {
    //T代表当前操纵的类型，K代表仅限的类型
    void save(T t);
    void update(T t);
    void delete(K k);
    T findOne(K k);
    List<T> findAll();
    //MyBatis方法有多个参数，需要用@Parm注解
    List<T> findByPage(@Param("start") Integer start, @Param("rows") Integer rows);
    Integer findTotals();
}

