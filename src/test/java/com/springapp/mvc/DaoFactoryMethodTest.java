package com.springapp.mvc;

import com.springapp.mvc.Dao.DaoFactoryMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by aji on 14. 3. 22..
 */
public class DaoFactoryMethodTest {

    public static void main(String[] args){

        ApplicationContext context = new FileSystemXmlApplicationContext("file:src/main/resources/spring/test.xml");

        DaoFactoryMethod factoryMethod = (DaoFactoryMethod)context.getBean("daoFactoryMethod");

        factoryMethod.getMessage();
    }
}
