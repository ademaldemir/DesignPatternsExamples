package com.designpatterns.bridge.devices;

import com.designpatterns.bridge.devices.Device;
import com.designpatterns.bridge.devices.Radio;
import com.designpatterns.bridge.devices.Tv;
import com.designpatterns.bridge.remotes.AdvancedRemote;
import com.designpatterns.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with Advanced Remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
    }
}
