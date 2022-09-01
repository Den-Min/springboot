package com.csdj.service;

import com.csdj.dao.AccounDao;
import com.csdj.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    @Autowired
    AccounDao accounDao;

    @Value("${user.userName}")
    private String userName;
    @Value("${user.password}")
    private String password;

    public void testUserService(){
        System.out.println("testUservice");
        userDao.testUserDao();
        accounDao.testAccounDao();
        System.out.println(userName+"\n"+password);
    }
}
