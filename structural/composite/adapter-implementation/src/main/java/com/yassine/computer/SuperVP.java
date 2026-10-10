package com.yassine.computer;

/**
 * @author pc
 **/
public class SuperVP implements Vga , Hdmi{
    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("~~~~~~~~~ Super Vp Via Hdmi ~~~~~~~~~~~");
        System.out.println(message);
        System.out.println("~~~~~~~~~ Super Vp Via Hdmi ~~~~~~~~~~~");
    }

    @Override
    public void print(String message) {
        System.out.println("$$$$$$$$$ Super Vp Via $$$$$$$");
        System.out.println(message);
        System.out.println("$$$$$$$$$ Super Vp Via Vga $$$$$$$");
    }
}
