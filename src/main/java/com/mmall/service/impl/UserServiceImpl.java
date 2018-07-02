package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.dao.UserMapper;
import com.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Object login(String username, String password) {
        int resultcount = userMapper.checkUsername(username);
        if(resultcount == 0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        else{
            return ServerResponse.createBySuccessMessage("登陆成功");
        }
    }
}
