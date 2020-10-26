package com.yjf.test;

import com.yjf.dao.AdminDao;
import com.yjf.dao.HrDao;
import com.yjf.entity.Admin;
import com.yjf.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 余俊锋
 * @date 2020/10/9 20:13
 * @Description
 */
public class Demo3 {
    @Test
    public void select(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        HrDao hrDao = session.getMapper(HrDao.class);
        hrDao.listAll().stream().forEach((n)->{
            System.out.println(n);
        });

    }

    @Test
    public void update(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        AdminDao adminDao = session.getMapper(AdminDao.class);


    }
    @Test
    public void delete(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        HrDao hrDao = session.getMapper(HrDao.class);

    }

    @Test
    public void insert(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        AdminDao adminDao = session.getMapper(AdminDao.class);


    }
}
