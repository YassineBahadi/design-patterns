package com.yassine.computer;

/**
 * @author pc
 **/
public class TV implements Hdmi{

    @Override
    public void view(byte[] data) {
        System.out.println("&&&&&&&& Hdmi &&&&&&&&");
        String message = new String(data);
        System.out.println(message);
        System.out.println("&&&&&&&& Hdmi &&&&&&&&");

    }
}
