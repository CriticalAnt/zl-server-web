package com.zl.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: wtao
 * @Date: 2018/12/17 19:50
 * @Version 1.0
 */
@Controller
public class MainController {

    @GetMapping(value = "main")
    public String main() {
        return "redirect:monitor/list";
    }

    @GetMapping("bar")
    public String bar() {
        return "bar";
    }
}
