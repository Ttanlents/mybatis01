package com.yjf.test;

import com.yjf.dao.StudentDao;
import com.yjf.entity.Student;
import com.yjf.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author 余俊锋
 * @date 2020/10/9 12:02
 * @Description
 */
public class Demo {
    final static Logger log=Logger.getLogger(Demo.class);
    @Test
    public void insert(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        StudentDao studentDao = session.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("陈七");
        student.setAge(18);
        student.setPassword("123456");
        //3.插入对象
        int count = studentDao.addStudent(student);
        //4.提交事务
        session.commit();
        //5.关闭
        session.close();
        System.out.println("返回值："+count);
        log.info("返回值："+count);
        //需求：实现ID回填，就是插入数据后要将数据库的ID设置在实体类对象里面
        System.out.println("ID："+student.getId());
        log.info("插入数据成功1："+"ID："+student.getId());
    }
    @Test
    public void listAll(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        StudentDao studentDao = session.getMapper(StudentDao.class);
        studentDao.listAll().forEach((n)->{
            System.out.println(n);
        });
    }
    @Test
    public void delete(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        StudentDao studentDao = session.getMapper(StudentDao.class);
        studentDao.deleteStudent(5);
        session.commit();
        //5.关闭
        session.close();
    }

    @Test
    public void update(){
        //1.获得操作对象，session
        SqlSession session = MybatisUtil.getSqlSession();
        //2.获得操作接口的动态对象
        StudentDao studentDao = session.getMapper(StudentDao.class);
        Student student=new Student();
        student.setId(1);
        student.setName("王八蛋");
        student.setAge(20);
        student.setPassword("123456");
        //3.插入对象
        studentDao.updateStudent(student);
        //4.提交事务
        session.commit();
        //5.关闭
        session.close();
    }
}
