package com.example.soi.ihere.control;

import com.example.soi.ihere.model.User;

/**
 * Created by soi on 5/18/2017.
 */

public class Controller {

    public static User getUser() {
        User user = new User();
        user.setUserName("huong");
        user.setUserId("huong.pq");
        user.setUserPassword("Huong1234");
        user.setUserIp("100.100.1.1");
        return user;
    }
}
