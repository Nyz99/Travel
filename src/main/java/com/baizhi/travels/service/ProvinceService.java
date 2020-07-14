package com.baizhi.travels.service;

import com.baizhi.travels.entity.Province;

import java.util.List;

public interface ProvinceService {
                                //当前页和每页纪录数
    List<Province> findByPage(Integer page,Integer rows);
    //查询总条数
    Integer findTotals();
    //省份保存
    void save (Province province);
    //省份删除
    void delete(String id);
    //查询一个
    Province findOne(String id);
    //更新
    void update(Province province);
}
