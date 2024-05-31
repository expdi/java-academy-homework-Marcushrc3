package expeditors.backend.adopter.domain;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class Adopter {

    private int id;
    private String name;
    private String phoneNumber;
    private LocalDate adoptionDate;
    private String adress;
    private LocalDate bornDate;
    Pet pet;



    public Adopter(String name, String phoneNumber, LocalDate adoptionDate, String adress, LocalDate bornDate, Pet pet) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.adoptionDate = adoptionDate;
        this.pet = pet;
        this.adress = adress;
        this.bornDate = bornDate;
    }

    public Adopter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(LocalDate adoptionDate) {
        this.adoptionDate = adoptionDate;
    }
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adoptionDate=" + adoptionDate +
                ", pet=" + pet +
                '}';
    }
}
