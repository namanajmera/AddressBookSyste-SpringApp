package com.naman.addressbooksystem.service;

import com.naman.addressbooksystem.dto.AddressBookDataDTO;
import com.naman.addressbooksystem.model.AddressBookContact;

import java.util.List;

public interface IAddressBookContactService {
    List<AddressBookContact> getAllContact();

    AddressBookContact getContactById(int contactId);

    AddressBookContact createContact(AddressBookDataDTO addressBookDataDTO);

    AddressBookContact updateContact(int contactId, AddressBookDataDTO addressBookDataDTO);

    void deleteContact(int contactId);
}
