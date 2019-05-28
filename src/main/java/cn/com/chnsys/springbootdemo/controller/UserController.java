package cn.com.chnsys.springbootdemo.controller;

import cn.com.chnsys.springbootdemo.pojo.User;
import cn.com.chnsys.springbootdemo.serivce.UserService;
import cn.com.chnsys.springbootdemo.utils.UUIDUtils;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Class: UserController
 * @description:
 * @Author: hongzhi.zhao
 * @Date: 2019-05-27 10:25
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    @ResponseBody
    public String register(User user) throws MessagingException {
        System.out.println("hello");
        System.out.println("code:===="+user.getCode());

        user.setCode(UUIDUtils.getUUID()+UUIDUtils.getUUID());
         userService.register(user);
         return "success";



    }
}
