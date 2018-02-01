package com.wallet.mybatis;

import com.alibaba.fastjson.JSONObject;
import com.wallet.Application;
import com.wallet.mybatis.bean.User;
import com.wallet.mybatis.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by yixy on 2018/2/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@MapperScan(basePackages = {"com.wallet.mybatis.mapper","mappper"})
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert() {
        User user = new User();
        user.setName("mybatis");
        userService.insert(user);
        Assert.assertTrue(true);
    }

    @Test
    public void query() {
        List<User> list = userService.query();
        for (User user : list)
            System.out.println(JSONObject.toJSONString(user));
        Assert.assertTrue(list.size() > 0);
    }
}
