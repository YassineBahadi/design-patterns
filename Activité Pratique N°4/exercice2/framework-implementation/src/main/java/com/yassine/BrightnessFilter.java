package com.yassine;

/**
 * @author pc
 **/
public class BrightnessFilter implements FilterStrategy{
    @Override
    public int[] filter(int[] data) {
        System.out.println(" .... (Brightness Filter)...");
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i] + 10;
        }
        return result;
    }
}
