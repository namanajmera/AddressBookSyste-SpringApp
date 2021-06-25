package com.naman.addressbooksystem.model;

import com.naman.addressbooksystem.dto.AddressBookDataDTO;

public class AddressBookContact {
    private int contactId;
    private String fullName;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zip;

    public AddressBookContact(int contactId, AddressBookDataDTO addressBookDataDTO) {
        this.contactId = contactId;
        this.fullName = addressBookDataDTO.fullName;
        this.phoneNumber= addressBookDataDTO.phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
