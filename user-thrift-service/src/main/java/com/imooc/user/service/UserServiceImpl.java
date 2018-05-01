package com.imooc.user.service;

import com.imooc.thrift.user.UserInfo;
import com.imooc.thrift.user.UserService.Iface;
import org.apache.thrift.TException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: huaTuo
 * \* Date: 2018/5/1
 * \* Time: 下午9:02
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class UserServiceImpl implements Iface {



    @Override
    public UserInfo getUserById(int id) throws TException {
        return null;
    }

    @Override
    public UserInfo getUserByName(String username) throws TException {
        return null;
    }

    @Override
    public void registerUser(UserInfo userInfo) throws TException {

    }
}