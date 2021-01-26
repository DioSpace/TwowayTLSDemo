package com.my.twowaytls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/")
public class TestController {
    private User getUser() {
        User user = new User();
        int id = new Random().nextInt(1000000000);
        user.setId(id);
        user.setName("Dio");
        user.setAge(18);
        user.setMyWords("Happy ! You get a data.");
        long timestamp = System.currentTimeMillis();
        user.setTimestamp(timestamp);
        return user;
    }

    @GetMapping("getdata")
    public User get_test() {
        User user = getUser();
        user.setMyWords("Happy ! The get request is success.");
        return user;
    }
}
