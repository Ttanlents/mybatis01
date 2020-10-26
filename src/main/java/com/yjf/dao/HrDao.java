package com.yjf.dao;

import com.yjf.entity.Admin;
import com.yjf.entity.Hr;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/10/9 20:12
 * @Description
 */
public interface HrDao {
    @Select("select * from hr")
    List<Hr> listAll();

    @Insert("insert into hr values(default,name,phone,telephone,address,enabled,username,password,userface,remark)")
    void insert(Hr hr);

    @Update("update hr set name=#{name} where id=#{id}")
    void update(Hr hr);

    @Delete("delete from hr where id=#{id}")
    void delete(Integer id);
}

