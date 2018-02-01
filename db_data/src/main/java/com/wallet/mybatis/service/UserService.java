package com.wallet.mybatis.service;

import com.wallet.mybatis.bean.User;
import com.wallet.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yixy on 2018/2/1.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public void insert(User user) {
        userMapper.insert(user);
    }

    public List<User> query() {
        return userMapper.query();
    }
}
