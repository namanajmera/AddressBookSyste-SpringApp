package com.naman.addressbooksystem.dto;

import lombok.ToString;

import javax.validation.constraints.Pattern;

public @ToString
class AddressBookDataDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Enter the valid firstName")
    public String fullName;

    public String address;

    public String city;
    public String state;
    public int zip;

    public AddressBookDataDTO(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressBookDataDTO{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
