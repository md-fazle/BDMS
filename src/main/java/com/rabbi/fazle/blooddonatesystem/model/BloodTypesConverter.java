package com.rabbi.fazle.blooddonatesystem.model;

import javax.persistence.AttributeConverter;

public class BloodTypesConverter implements AttributeConverter<Bloodtypes,String> {
    @Override
    public String convertToDatabaseColumn(Bloodtypes attribute) {
        return attribute.toString();
    }

    @Override
    public Bloodtypes convertToEntityAttribute(String bloodTypes) {
        return Bloodtypes.of(bloodTypes).orElse(null);
    }

}
