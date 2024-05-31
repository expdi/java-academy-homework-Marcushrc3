package com.marcus;

import java.time.LocalDate;

public class AdopterMain {
    public static void main(String[] args) {
        Adopter adopter1 = new Adopter(1, "John Doe", "Buddy", 1234567890L, LocalDate.of(2023, 5, 19), "Labrador", AnimalType.DOG);
        Adopter adopter2 = new Adopter(2, "Jane Smith", "Whiskers", 9876543210L, LocalDate.of(2023, 5, 20), "Siamese", AnimalType.CAT);

        System.out.println(adopter1);
        System.out.println(adopter2);
    }
}
