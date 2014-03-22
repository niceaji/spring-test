package com.springapp.mvc.Dao;

/**
 * Created by aji on 14. 3. 22..
 */
public class DaoFactoryMethod {

    private static DaoFactoryMethod instance;

    //싱글턴
    public static DaoFactoryMethod getInstance(){

        if(instance == null){
            instance = new DaoFactoryMethod();
        }
        return instance;

    }

    private DaoFactoryMethod(){}

    public void getMessage(){
        System.out.println("getMessage()");
    }
}
