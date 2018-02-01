package com.wallet.mybatis.mapper;

import com.wallet.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yixy on 2018/2/1.
 */
public interface UserMapper {

    public void insert(@Param("user") User user);

    public List<User> query();

}
