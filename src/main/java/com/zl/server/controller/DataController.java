package com.zl.server.controller;

import com.zl.server.bean.DataModel;
import com.zl.server.bean.DataPoint;
import com.zl.server.mapper.DataModelMapper;
import com.zl.server.mapper.DataPointMapper;
import com.zl.server.test.DevList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wtao
 * @Date: 2018/12/16 15:35
 * @Version 1.0
 */
@Controller()
@RequestMapping("data")
public class DataController {

    @Autowired
    DataModelMapper dataModelMapper;

    @Autowired
    DataPointMapper dataPointMapper;

    @GetMapping("list")
    public String list(Model model) {
        List<DataModel> list = new ArrayList<>();
        try {
            list = dataModelMapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setRelationCount(dataPointMapper.countByModelId(list.get(i).getId()));
        }
        model.addAttribute("models", list);
        model.addAttribute("counts", list);
        return "data/list";
    }

    @PostMapping("list")
    public String insert(DataModel dataModel) {
        if (dataModel.getModelName() == null) {
            return "error";
        }
        if (dataModelMapper.insert(dataModel)) {
            return "redirect:/data/list";
        } else {
            return "error";
        }
    }

    @PostMapping("addPoint")
    public String addPoint(DataPoint dataPoint) {
        int a = 0;
        return "data/list";
    }

    @GetMapping("dictionary")
    public String dictionary(Model model) {
        DevList devList = new DevList();
        model.addAttribute("devs", devList.getDevices());
        return "data/dictionary";
    }

    @GetMapping(value = "dictionary/{id}")
    public String dictionary2(@PathVariable("id") String id, Model model) {
        model.addAttribute("dics", new ArrayList<>());
        return "data/dictionary";
    }
}
