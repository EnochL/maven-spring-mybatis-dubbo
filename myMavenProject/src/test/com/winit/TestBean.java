package com.winit;


import javax.annotation.Resource;
import javax.sql.DataSource;

import com.winit.mybatis.dao.StudentDao;
import com.winit.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.winit.beans.SecondBean;

import java.util.List;

@ContextConfiguration(locations={"/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestBean {
   @Autowired
   private SecondBean seBean;
   
   @Resource(name="dataSource")
   private DataSource ds;
  @Autowired
  private StudentDao studentDao;
   @Test
   public void test()
   {
	  /* System.out.println(seBean.getFirBean().name);
	   System.out.println(ds);*/
       List<Student> lst=studentDao.getStudentsByName("张三");
       for(Student s : lst)
       {
           System.out.println(s.getName());
           System.out.println(s.getIdcard());
           System.out.println(s.getAge());
           System.out.println(s.getCreatedate() );
       }
   }
	
}
