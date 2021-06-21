package com.naman.addressbooksystem.model;

import com.naman.addressbooksystem.dto.AddressBookDataDTO;

public class AddressBookContact {
    private int contactId;
    private String firstName;
    private String lastName;
    private String address;

    public AddressBookContact(int contactId, AddressBookDataDTO addressBookDataDTO) {
        this.contactId = contactId;
        this.firstName = addressBookDataDTO.firstName;
        this.lastName = addressBookDataDTO.lastName;
        this.address = addressBookDataDTO.address;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
