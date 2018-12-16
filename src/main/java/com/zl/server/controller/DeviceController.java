package com.zl.server.controller;

import com.zl.server.test.DevList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: wtao
 * @Date: 2018/12/16 13:54
 * @Version 1.0
 */
@Controller
public class DeviceController {

    @GetMapping(value = "devices")
    public String list(Model model) {
        DevList devList = new DevList();
        model.addAttribute("devs", devList.getDevices());
        return "device/list";
    }
}
