package com.xlyd.com.myshop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/listAll")
    public List<User> listAll() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setName("name-" + i);
            user.setShow(i % 2 == 0);
            user.setPosition("position--" + i);
            users.add(user);
        }
        return users;
    }
}
