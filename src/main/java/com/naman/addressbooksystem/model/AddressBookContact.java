package com.naman.addressbooksystem.model;

import com.naman.addressbooksystem.dto.AddressBookDataDTO;

public class AddressBookContact {
    private int contactId;
    private String fullName;
    public String address;
    public String city;
    public String state;
    public int zip;

    public AddressBookContact(int contactId, AddressBookDataDTO addressBookDataDTO) {
        this.contactId = contactId;
        this.fullName = addressBookDataDTO.fullName;
        this.address = addressBookDataDTO.address;
        this.city=addressBookDataDTO.city;
        this.state=addressBookDataDTO.state;
        this.zip=addressBookDataDTO.zip;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
