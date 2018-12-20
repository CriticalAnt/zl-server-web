package com.zl.server.controller;

import com.zl.server.bean.User;
import com.zl.server.mapper.UserMapper;
import com.zl.server.utils.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: wtao
 * @Date: 2018/12/16 0:04
 * @Version 1.0
 */

@Controller
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @PostMapping("login")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("passWord") String passWord,
                        Model model, HttpSession session)
            throws UnsupportedEncodingException, NoSuchAlgorithmException {
        User user = userMapper.findUser(userName);
        if (Md5Utils.validPassword(passWord, user.getPassWord())) {
            model.addAttribute("user", userName);
            session.setAttribute("user", userName);
            return "redirect:monitor/list";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }
    }
}
