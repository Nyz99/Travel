package com.baizhi.travels.service;

import com.baizhi.travels.dao.ProvinceDAO;
import com.baizhi.travels.entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//相当于xml中的bean ，将自动注册到Spring容器，不需要再在applicationContext.xml文件定义bean了
@Transactional//开启事物管理
public class ProvinceServiceImpl implements ProvinceService{
    @Autowired
    private ProvinceDAO provinceDAO;
    @Override
    public List<Province> findByPage(Integer page,Integer rows){
        int start = (page-1)*rows;//起始条数
        return provinceDAO.findByPage(start,rows);//对数据库进行操作
    }
    @Override
    public Integer findTotals(){
        return provinceDAO.findTotals();
    }

    @Override
    public void save(Province province){
        province.setPlacecounts(0);
        provinceDAO.save(province);
    }
    @Override
    public void delete(String id){
        provinceDAO.delete(id);
    }

    @Override
    public Province findOne(String id){
        return provinceDAO.findOne(id);
    }

    @Override
    public void update(Province province) {
        provinceDAO.update(province);
    }
}
