package com.afeng.service;

import com.afeng.mapper.UserMapper;
import com.afeng.pojo.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author afeng
 * @date 2018/9/25 19:45
 **/
@Service("userServiceImpl")
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserMapper userMapper;


    @Override
    public void insertUser(User user)
    {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUser(Integer id)
    {

    }

    @Override
    public void updateUser(User user)
    {

    }

    @Override
    public User queryUser(Integer id)
    {
        return null;
    }

    @Override
    public List<User> queryAllUser()
    {
        return null;
    }
}
