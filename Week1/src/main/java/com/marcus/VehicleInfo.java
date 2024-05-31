package com.marcus;

// Lesson 1
public class VehicleInfo {
    public static void main(String[] args) {
        // Define variables to hold vehicle information
        int vin = 123456; // Vehicle identification number
        String makeModel = "Ford Lindonjhonson"; // Vehicle make/model
        String color = "Black"; // Vehicle color
        boolean hasTowingPackage = true; // Whether the vehicle has a towing package
        int odometerReading = 50000; // Odometer reading
        double price = 25000.50; // Price
        char qualityRating = 'A'; // Quality rating (A, B, or C)

        // Print out the values of variables
        System.out.println("Vehicle Information:");
        System.out.println("VIN: " + vin);
        System.out.println("Make/Model: " + makeModel);
        System.out.println("Color: " + color);
        System.out.println("Towing Package: " + (hasTowingPackage ? "Yes" : "No"));
        System.out.println("Odometer Reading: " + odometerReading);
        System.out.println("Price: $" + price);
        System.out.println("Quality Rating: " + qualityRating);
    }
}
