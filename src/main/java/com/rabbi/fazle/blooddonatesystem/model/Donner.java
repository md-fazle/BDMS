package com.rabbi.fazle.blooddonatesystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Donner {
    @Id
    private long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    @Convert(converter = BloodTypesConverter.class)
    private Bloodtypes bloodTypes;

    public Donner(String name, String email, String phone, String address, Bloodtypes bloodtypes) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.bloodTypes = bloodtypes;
    }
}
