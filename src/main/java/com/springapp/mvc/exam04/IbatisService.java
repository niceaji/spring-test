package com.springapp.mvc.exam04;

/**
 * Created by aji on 14. 3. 22..
 */
public class IbatisService {
    private IbatisDao ibatisDao;

    public void setIbatisDao(IbatisDao ibatisDao) {
        this.ibatisDao = ibatisDao;
    }

    public void daoTest(){
        System.out.println("start");
        ibatisDao.insert();
        ibatisDao.update();

        System.out.println("end");
    }
}
