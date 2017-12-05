package com.hskj.maven_spring.dao;

import com.hskj.maven_spring.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @author jzh
 * @date2017/12/5 0005下午 11:14
 */
public interface UserDao {
    public int countAll();
    public void insertUser(User user);
    public List<User> getAllUser();
    public User getById(String id);
    public void deleteUser(String id);
    public void updateUser(Map<String,Object> map);

}
