package com.naman.addressbooksystem.dto;

import javax.validation.constraints.Pattern;

public class AddressBookDataDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}")
    public String lastName;

    public String address;

    public AddressBookDataDTO(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressBookDataDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
