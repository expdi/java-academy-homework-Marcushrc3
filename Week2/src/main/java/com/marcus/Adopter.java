package com.marcus;
import java.time.LocalDate;

public class Adopter {
    private int id;
    private String adopterName;
    private String petName;
    private long phoneNumber;
    private LocalDate dateOfAdoption;
    private String animalBreed;
    private AnimalType animalType;


    public Adopter(int id, String adopterName, String petName, long phoneNumber, LocalDate dateOfAdoption, String animalBreed, AnimalType animalType) {
        this.id = id;
        this.adopterName = adopterName;
        this.petName = petName;
        this.phoneNumber = phoneNumber;
        this.dateOfAdoption = dateOfAdoption;
        this.animalBreed = animalBreed;
        this.animalType = animalType;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(LocalDate dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "id=" + id +
                ", adopterName='" + adopterName + '\'' +
                ", petName='" + petName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dateOfAdoption=" + dateOfAdoption +
                ", animalBreed='" + animalBreed + '\'' +
                ", animalType=" + animalType +
                '}';
    }
}
