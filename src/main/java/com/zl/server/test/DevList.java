package com.zl.server.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: wtao
 * @Date: 2018/12/16 15:51
 * @Version 1.0
 */
public class DevList {

    private List<Device> devices;

    public DevList() {
        this.devices = new ArrayList<>();
        addDevice();
    }

    private void addDevice() {
        Device device = new Device();
        device.setStatus(true);
        device.setName("测试1");
        device.setDevNum("001");
        device.setGroup("默认分组");
        device.setDevType("默认设备");
        device.setProtocol("Modbus-RTU");
        device.setFrequence("-");
        device.setUser("admin");
        device.setDate(new Date());

        Device device1 = new Device();
        device1.setStatus(true);
        device1.setName("测试2");
        device1.setDevNum("002");
        device1.setGroup("默认分组");
        device1.setDevType("默认设备");
        device1.setProtocol("Modbus-RTU");
        device1.setFrequence("-");
        device1.setUser("admin");
        device1.setDate(new Date());

        devices.add(device);
        devices.add(device1);
    }

    public List<Device> getDevices() {
        return devices;
    }
}
