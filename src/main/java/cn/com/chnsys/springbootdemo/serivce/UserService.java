package cn.com.chnsys.springbootdemo.serivce;

import cn.com.chnsys.springbootdemo.pojo.User;
import javax.mail.MessagingException;

/**
 * @Class: UserService
 * @description:
 * @Author: hongzhi.zhao
 * @Date: 2019-05-27 10:27
 */
public interface UserService {

    void register(User user) throws MessagingException;
}
