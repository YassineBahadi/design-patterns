package com.yassine;

import java.util.Arrays;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] image = {100, 120, 130, 140, 150, 160};
        System.out.println("original image " + Arrays.toString(image));

        ImageProcessor processor = new ImageProcessor(image);

        processor.setFilterStrategy(new BrightnessFilter());
        int[] filteredImage = processor.executeFilter();
        System.out.println("result after brightness filter" + Arrays.toString(filteredImage));

        System.out.println("----------------------------------------");

        ImplNonStandard oldSystem = new ImplNonStandard();
        FilterStrategy adaptedFilter = new FilterAdapter(oldSystem, "VintageFilter");

        processor.setFilterStrategy(adaptedFilter);
        int[] oldFilteredImage = processor.executeFilter();
        System.out.println("result after adapter filter " + Arrays.toString(oldFilteredImage));

        System.out.println("----------------------------------------");

        processor.setImageCompressor(new LosslessCompressor());
        int[] compressedImage = processor.executeCompression();
        System.out.println("final result after compression " + Arrays.toString(compressedImage));

    }
}