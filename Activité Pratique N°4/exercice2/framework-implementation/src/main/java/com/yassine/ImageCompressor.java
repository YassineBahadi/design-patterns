package com.yassine;

/**
 * @author pc
 **/
public abstract class ImageCompressor {
    public final int[] compresser(int[] data) {
        System.out.println("---Starting compresser---");

        if (data == null || data.length == 0) {
            return new int[0];
        }

        int[] processedData = appliquerCompressionSpecifique(data);

        System.out.println("compresser success" + data.length + " new Size " + processedData.length);
        return processedData;
    }

    protected abstract int[] appliquerCompressionSpecifique(int[] data);
}
