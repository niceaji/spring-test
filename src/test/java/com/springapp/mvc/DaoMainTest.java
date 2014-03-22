package com.springapp.mvc;

import com.springapp.mvc.Dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by aji on 14. 3. 22..
 */
public class DaoMainTest {

    public static void main(String[] args){


        ApplicationContext context = new FileSystemXmlApplicationContext("file:src/main/resources/spring/test.xml");

        TestDao testDao = (TestDao)context.getBean("testDaoImp");

        System.out.println("aaa");
        testDao.printMessage();
        System.out.println("ddd");

    }
}
