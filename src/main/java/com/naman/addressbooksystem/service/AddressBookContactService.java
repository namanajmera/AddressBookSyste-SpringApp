package com.naman.addressbooksystem.service;

import com.naman.addressbooksystem.dto.AddressBookDataDTO;
import com.naman.addressbooksystem.exception.AddressBookException;
import com.naman.addressbooksystem.model.AddressBookContact;
import com.naman.addressbooksystem.repository.IAddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookContactService implements IAddressBookContactService {

    @Autowired
    private IAddressBookRepository iAddressBookRepository;

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
        log.info("Contact: ",addressBookContact.toString());
        iAddressBookRepository.save(addressBookContact);
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
