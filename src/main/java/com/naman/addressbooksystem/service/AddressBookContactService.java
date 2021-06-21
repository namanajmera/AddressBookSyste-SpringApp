package com.naman.addressbooksystem.service;

import com.naman.addressbooksystem.dto.AddressBookDataDTO;
import com.naman.addressbooksystem.model.AddressBookContact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookContactService implements IAddressBookContactService {

    @Override
    public List<AddressBookContact> getAllContact() {
        List<AddressBookContact> addressBookContactList = new ArrayList<>();
        addressBookContactList.add(new AddressBookContact(1,
                new AddressBookDataDTO("Naman", "Ajmera", "Ajmera Bhawan Chaksu")));
        return addressBookContactList;
    }

    @Override
    public AddressBookContact getContactById(int contactId) {
        AddressBookContact addressBookContact = new AddressBookContact(contactId,
                new AddressBookDataDTO("Naman", "Ajmera", "Chaksu"));
        return addressBookContact;
    }

    @Override
    public AddressBookContact createContact(AddressBookDataDTO addressBookDataDTO) {
        AddressBookContact addressBookContact = new AddressBookContact(1, addressBookDataDTO);
        return addressBookContact;
    }

    @Override
    public AddressBookContact updateContact(int contactId, AddressBookDataDTO addressBookDataDTO) {
        AddressBookContact addressBookContact = new AddressBookContact(contactId, addressBookDataDTO);
        return addressBookContact;
    }

    @Override
    public void deleteContact(int contactId) {
        AddressBookContact addressBookContact = new AddressBookContact(contactId, new AddressBookDataDTO("Naman", "Ajmera", "Chaksu"));
        return;
    }
}
