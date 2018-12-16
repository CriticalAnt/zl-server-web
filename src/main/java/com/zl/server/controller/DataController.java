package com.zl.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: wtao
 * @Date: 2018/12/16 15:35
 * @Version 1.0
 */
@Controller
public class DataController {

    @GetMapping("data")
    public String list() {
        return "data/list";
    }
}
