package cn.com.chnsys.springbootdemo.serivce.Impl;

import cn.com.chnsys.springbootdemo.mapper.UserMapper;
import cn.com.chnsys.springbootdemo.pojo.User;
import cn.com.chnsys.springbootdemo.serivce.UserService;
import cn.com.chnsys.springbootdemo.utils.MailUtils;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Class: UserServiceImpl
 * @description:
 * @Author: hongzhi.zhao
 * @Date: 2019-05-27 10:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) throws MessagingException {
        userMapper.insertUser(user);
        //发送一封激活邮件
        MailUtils.sendMail(user.getEmail(),user.getCode());
    }
}
