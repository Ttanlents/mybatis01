package com.yjf.test;

import com.yjf.dao.AdminDao;
import com.yjf.dao.StudentDao;
import com.yjf.entity.Admin;
import com.yjf.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/10/9 19:44
 * @Description
 */
public class Demo2 {
    @Test
    public void select(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        AdminDao adminDao = session.getMapper(AdminDao.class);
       adminDao.listAll().stream().forEach((n)->{
           System.out.println(n);
       });

    }
    @Test
    public void update(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        AdminDao adminDao = session.getMapper(AdminDao.class);
        Admin admin=new Admin();
        admin.setAdminId(1001);
        admin.setAdminName("jack");
        adminDao.update(admin);
        session.commit();
        session.close();

    }
    @Test
    public void delete(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        AdminDao adminDao = session.getMapper(AdminDao.class);
       adminDao.delete(1001);
        session.commit();
        session.close();

    }

    @Test
    public void insert(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        AdminDao adminDao = session.getMapper(AdminDao.class);
        Admin admin=new Admin();
        admin.setAdminCode("admin23");
        admin.setAdminName("jack");
        admin.setAdminEmail("825362171@qq.com");
        admin.setAdminPassword("123456");
        admin.setAdminTelephone("1306921849");
        DateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
        String date = dateFormat.format(new Date());
        admin.setAdminEnrolldate(date);
        adminDao.insert(admin);
        session.commit();
        session.close();

    }



}
