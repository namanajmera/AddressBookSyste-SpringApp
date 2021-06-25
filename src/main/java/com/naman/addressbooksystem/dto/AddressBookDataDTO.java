package com.naman.addressbooksystem.dto;

import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public @ToString
class AddressBookDataDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Enter the valid firstName")
    public String fullName;

    @NotNull(message = "Address Should not be empty.")
    public String address;

    @NotNull(message = "City should not be empty")
    public String city;

    @NotBlank(message = "State should not be empty")
    public String state;

    @Pattern(regexp = "([0]{1}\\s|[+][9]{1}[1]{1}\\s)?[6-9]{1}[0-9]{9}", message = "Enter the valid mobile number with proper format")
    public String phoneNumber;

    public String zip;

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
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
