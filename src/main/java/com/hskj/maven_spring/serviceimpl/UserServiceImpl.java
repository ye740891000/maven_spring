package com.hskj.maven_spring.serviceimpl;

import com.hskj.maven_spring.dao.UserDao;
import com.hskj.maven_spring.domain.User;
import com.hskj.maven_spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author jzh
 * @date2017/12/5 0005下午 11:16
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public int countAll() {
        return this.userDao.countAll();
    }

    @Override
    public void insertUser(User user) {
        this.userDao.insertUser(user);
        throw new RuntimeException("Error");
    }


    @Override
    public void update_insert(Map map, User user) {
        this.userDao.updateUser(map);
        this.userDao.insertUser(user);
        throw new RuntimeException("Error");

    }

}
