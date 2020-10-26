package com.yjf.dao;

import com.yjf.entity.Admin;

import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/10/9 19:34
 * @Description
 */
public interface AdminDao {
    List<Admin> listAll();

    void insert(Admin admin);

    void update(Admin admin);

    void delete(Integer id);

}
