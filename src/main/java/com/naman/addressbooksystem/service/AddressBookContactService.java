package com.naman.addressbooksystem.service;

import com.naman.addressbooksystem.dto.AddressBookDataDTO;
import com.naman.addressbooksystem.exception.AddressBookException;
import com.naman.addressbooksystem.model.AddressBookContact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookContactService implements IAddressBookContactService {

    private List<AddressBookContact> addressBookContactList=new ArrayList<>();

    @Override
    public List<AddressBookContact> getAllContact() {
        return addressBookContactList;
    }

    @Override
    public AddressBookContact getContactById(int contactId) {
        return addressBookContactList.stream()
                .filter(addressBookContact -> addressBookContact.getContactId() == contactId)
                .findFirst()
                .orElseThrow(()->new AddressBookException("Contact Not Found"));
    }

    @Override
    public AddressBookContact createContact(AddressBookDataDTO addressBookDataDTO) {
        AddressBookContact addressBookContact = new AddressBookContact(addressBookContactList.size()+1, addressBookDataDTO);
        addressBookContactList.add(addressBookContact);
        return addressBookContact;
    }

    @Override
    public AddressBookContact updateContact(int contactId, AddressBookDataDTO addressBookDataDTO) {
        AddressBookContact addressBookContact = new AddressBookContact(contactId, addressBookDataDTO);
        addressBookContactList.set(contactId-1,addressBookContact);
        return addressBookContact;
    }

    @Override
    public void deleteContact(int contactId) {
        addressBookContactList.remove(contactId-1);
    }
}
