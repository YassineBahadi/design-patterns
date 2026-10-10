package com.yassine.computer.adapter;

import com.yassine.computer.Hdmi;
import com.yassine.computer.Vga;

/**
 * @author pc
 **/
public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;
    @Override
    public void print(String message) {
        System.out.println("@@@@@@@@ Adapter @@@@@@@@");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("@@@@@@@@ /Adapter @@@@@@@@");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
