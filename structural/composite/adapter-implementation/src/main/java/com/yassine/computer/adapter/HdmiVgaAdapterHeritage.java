package com.yassine.computer.adapter;

import com.yassine.computer.Hdmi;
import com.yassine.computer.TV;
import com.yassine.computer.Vga;

/**
 * @author pc
 **/
public class HdmiVgaAdapterHeritage extends TV implements Vga {
    @Override
    public void print(String message) {
        System.out.println("@@@@@@@@ Adapter @@@@@@@@");
        byte[] data=message.getBytes();
        super.view(data);
        System.out.println("@@@@@@@@ /Adapter @@@@@@@@");
    }
}
