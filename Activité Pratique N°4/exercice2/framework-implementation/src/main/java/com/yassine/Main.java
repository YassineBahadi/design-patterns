package com.yassine;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] image = {50, 70, 90, 110, 130, 150};
        System.out.println("=== FrameWork of image filtring and compressing ===");
        System.out.println("The actual information of the image " + Arrays.toString(image));
        System.out.println("----------------------------------------------");

        ImageProcessor processor = new ImageProcessor(image);

        System.out.print("Enter the complet name of the filter example :  BrightnessFilter ");
        String filterClassName = scanner.nextLine();

        try {
            Class<?> filterClass = Class.forName(filterClassName);

            FilterStrategy userFilter = (FilterStrategy) filterClass.getDeclaredConstructor().newInstance();

            processor.setFilterStrategy(userFilter);

            int[] filteredImage = processor.executeFilter();
            System.out.println("The result after Filter" + Arrays.toString(filteredImage));

        } catch (ClassNotFoundException e) {
            System.err.println("No filter found with this name " + filterClassName);
        } catch (Exception e) {
            System.err.println("Error during fintring process " + e.getMessage());
        }

        System.out.println("----------------------------------------------");

        System.out.print("Enter the complet name of the compresor");
        String compressClassName = scanner.nextLine();

        try {
            Class<?> compressClass = Class.forName(compressClassName);

            ImageCompressor userCompressor = (ImageCompressor) compressClass.getDeclaredConstructor().newInstance();

            processor.setImageCompressor(userCompressor);

            int[] compressedImage = processor.executeCompression();
            System.out.println("The final result after compressing" + Arrays.toString(compressedImage));

        } catch (ClassNotFoundException e) {
            System.err.println("No compresor found " + compressClassName);
        } catch (Exception e) {
            System.err.println("Error during processing process" + e.getMessage());
        }

        scanner.close();
        System.out.println("==============================================");

    }
}