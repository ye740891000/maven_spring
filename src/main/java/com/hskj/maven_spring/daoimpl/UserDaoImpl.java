package com.hskj.maven_spring.daoimpl;

import com.hskj.maven_spring.dao.UserDao;
import com.hskj.maven_spring.domain.User;
import com.hskj.maven_spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author jzh
 * @date2017/12/5 0005下午 11:15
 */
@Service("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;

    public int countAll() {
        return  this.userMapper.countAll();
    }

    @Override
    public void insertUser(User user) {
        this.userMapper.insertUser(user);


    }

    @Override
    public List<User> getAllUser() {
        return this.userMapper.getAllUser();
    }

    @Override
    public User getById(String id) {
        return this.userMapper.getById(id);
    }

    @Override
    public void deleteUser(String id) {
        this.userMapper.deleteUser(id);

    }

    @Override
    public void updateUser(Map<String, Object> map) {
        this.userMapper.updateUser(map);
    }

}