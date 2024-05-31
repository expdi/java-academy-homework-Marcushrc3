package expeditors.backend.week12.builder;

import expeditors.backend.week12.model.Adopter;

import java.time.LocalDate;
import java.util.Objects;

public class AdopterBuilder {
    private int id;
    private String name;
    private String phoneNumber;
    private LocalDate adoptionDate;
    private String address;
    private LocalDate bornDate;

    public AdopterBuilder setName(String name){
        if(Objects.isNull(name))
            throw new IllegalArgumentException("Invalid first name");
        this.name = name;
        return this;
    }
    public AdopterBuilder setEmail(String phoneNumber){
        if(phoneNumber.length()!=9)
            throw new IllegalArgumentException("Invalid cell number");
        this.phoneNumber = phoneNumber;
        return this;
    }
    public AdopterBuilder setAdress(String address){
        this.address = address;
        return this;
    }

    public AdopterBuilder setBornDate(LocalDate bornDate){
        this.bornDate = bornDate;
        return this;
    }


    public Adopter build(){
        Adopter adopter = new Adopter();
        adopter.setName(this.name);
        adopter.setAdress(this.address);
        adopter.setAdoptionDate(this.adoptionDate);
        adopter.setBornDate(this.bornDate);
        adopter.setPhoneNumber(this.phoneNumber);
        return adopter;
    }


}
