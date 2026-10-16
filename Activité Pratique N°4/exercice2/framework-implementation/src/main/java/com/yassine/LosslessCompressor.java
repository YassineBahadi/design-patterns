package com.yassine;

/**
 * @author pc
 **/
public class LosslessCompressor extends  ImageCompressor{
    @Override
    protected int[] appliquerCompressionSpecifique(int[] data) {
        System.out.println("::::: (Lossless compressing )...");
        int[] compressed = new int[data.length / 2];
        System.arraycopy(data, 0, compressed, 0, compressed.length);
        return compressed;
    }
}
