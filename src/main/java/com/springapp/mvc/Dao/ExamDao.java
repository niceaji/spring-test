package com.springapp.mvc.Dao;

/**
 * Created by aji on 14. 3. 22..
 */
public class ExamDao {

    private  String msg;

    public ExamDao(){}

    public ExamDao(String msg){
        this.msg = msg;
    }
    public void printMessage(){
        System.out.println("msg:"+msg);
    }
}
