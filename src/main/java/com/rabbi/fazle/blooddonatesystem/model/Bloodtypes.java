package com.rabbi.fazle.blooddonatesystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Optional;
import java.util.stream.Stream;

public enum  Bloodtypes {
    @JsonProperty("A+")
    A_POSSITIVE("A+"),
    @JsonProperty("B+")
    B_POSSITIVE("B+"),
    @JsonProperty("AB+")
    AB_POSSITIVE("AB+"),
    @JsonProperty("A-")
    A_NEGETIVE("A-"),
    @JsonProperty("B-")
    B_NEGETIVE("B-"),
    @JsonProperty("AB-")
    AB_NEGETIVE("AB-"),
    @JsonProperty("O+")
    O_POSSITIVE("O+"),
    @JsonProperty("O-")
    O_NEGETIVE("O-");
    String sortBloodTypes;
    private Bloodtypes(String sortBloodTypes){
        this.sortBloodTypes=sortBloodTypes;
    }
    public String getSortBloodTypes(){
        return sortBloodTypes;
    }
    public void setSortBloodTypes(String sortBloodTypes){
        this.sortBloodTypes=sortBloodTypes;
    }
    public static Optional<Bloodtypes> of(String value){
        return Stream.of(values()).filter(v->v.sortBloodTypes.equalsIgnoreCase(value)).findFirst();
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
