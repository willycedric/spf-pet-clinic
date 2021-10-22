package com.invasivemushrooms.spring.spgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petTyype;
    private Owner owner;
    private LocalDate birthDate;
    public PetType getPetTyype() {
        return petTyype;
    }

    public void setPetTyype(PetType petTyype) {
        this.petTyype = petTyype;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


}
