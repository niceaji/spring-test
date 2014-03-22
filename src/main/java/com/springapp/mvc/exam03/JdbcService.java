package com.springapp.mvc.exam03;

/**
 * Created by aji on 14. 3. 22..
 */
public class JdbcService {
    private JdbcDao jdbcDao;

    public JdbcService() {
    }

    public JdbcService(JdbcDao jdbcDao) {
        this.jdbcDao = jdbcDao;
    }

    public void serviceTest(){
        jdbcDao.insert();
        jdbcDao.delete();
    }
}
