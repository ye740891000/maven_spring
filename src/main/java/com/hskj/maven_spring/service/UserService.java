package com.hskj.maven_spring.service;

import com.hskj.maven_spring.domain.User;

import java.util.Map;

/**
 * @author jzh
 * @date2017/12/5 0005下午 11:15
 */
public interface UserService {
    public int countAll();
    public void insertUser(User user);
    public void update_insert(Map map, User user);

}
