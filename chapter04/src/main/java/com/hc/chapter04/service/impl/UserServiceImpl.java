package com.hc.chapter04.service.impl;

import com.hc.chapter04.mapper.UserMapper;
import com.hc.chapter04.pojo.User;
import com.hc.chapter04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper usermapper;

    @Override
    public User login(User user) {
        return usermapper.login(user);
    }

    @Override
    public List<User> getUserlist(Map<String, Object> map) {

        return usermapper.getUserlist(map);
    }

    @Override
    public Integer Add(User user) {
        return usermapper.Add(user);
    }

    @Override
    public User getinfo(Integer uId) {
        return usermapper.getinfo(uId);
    }

    @Override
    public Integer updateuser(User user) {
        return usermapper.updateuser(user);
    }

    @Override
    public Integer updatepwd(User user) {
        return usermapper.updatepwd(user);
    }

    @Override
    public Integer del(Integer uId) {
        return usermapper.del(uId);
    }
}
