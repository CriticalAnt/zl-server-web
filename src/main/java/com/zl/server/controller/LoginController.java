package com.zl.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wtao
 * @Date: 2018/12/16 0:04
 * @Version 1.0
 */

@Controller
public class LoginController {

    @RequestMapping("index")
    public String index() {
        return "login";
    }

    @RequestMapping("/11")
    public String main(Model model) {
        model.addAttribute("user","数据返回测试");
        return "dashboard";
    }
}
