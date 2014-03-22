package com.springapp.mvc;

import com.springapp.mvc.exam04.IbatisService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by aji on 14. 3. 22..
 */
public class Exam04Test {
    @Test
    public void testCode() throws Exception {

        ApplicationContext context = new FileSystemXmlApplicationContext("file:src/main/resources/spring/test.xml");

        IbatisService ibatisService = (IbatisService)context.getBean("ibatisService");

        ibatisService.daoTest();




    }
}
