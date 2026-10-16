package com.yassine;

/**
 * @author pc
 **/
public class ImageProcessor {
    private int[] imageData;
    private FilterStrategy filterStrategy;
    private ImageCompressor imageCompressor;

    public ImageProcessor(int[] imageData) {
        this.imageData = imageData;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setImageCompressor(ImageCompressor imageCompressor) {
        this.imageCompressor = imageCompressor;
    }

    public int[] executeFilter() {
        if (filterStrategy == null) {
            System.out.println("no filter strategy chosed");
            return imageData;
        }
        return filterStrategy.filter(imageData);
    }

    public int[] executeCompression() {
        if (imageCompressor == null) {
            System.out.println("no compresor  strategy chosed");
            return imageData;
        }
        return imageCompressor.compresser(imageData);
    }
}
