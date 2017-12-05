package com.hskj.maven_spring;

import com.hskj.maven_spring.domain.User;
import com.hskj.maven_spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jzh
 * @date2017/12/5 0005下午 11:16
 */
public class UserServiceTest {

    @Test
    public void userServiceTest(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)context.getBean("userService");
        User user =new User();
        user.setId("003");
        user.setName("樱木花道");

        Map map=new HashMap();
        map.put("id", "001");
        map.put("name", "方舟子");
        try {
            System.out.println(userService.countAll());
            //userService.update_insert(map, user);
            //	 userService.insertUser(user);//
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}