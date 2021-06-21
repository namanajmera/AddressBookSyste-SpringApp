package com.naman.addressbooksystem.dto;

public class AddressBookDataDTO {
    public String firstName;
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
