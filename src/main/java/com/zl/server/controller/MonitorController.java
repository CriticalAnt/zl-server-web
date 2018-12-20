package com.zl.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wtao
 * @Date: 2018/12/17 19:56
 * @Version 1.0
 */
@Controller
@RequestMapping("monitor")
public class MonitorController {

    @GetMapping(value = "list")
    public String monitor() {
        return "monitor/list";
    }
}
