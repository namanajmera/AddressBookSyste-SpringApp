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


    @Override
    public List<AddressBookContact> getAllContact() {
        return iAddressBookRepository.findAll();
    }

    @Override
    public AddressBookContact getContactById(int contactId) {
        return iAddressBookRepository
                .findById(contactId)
                .orElseThrow(()->new AddressBookException("Contact Not Found"));
    }

    @Override
    public AddressBookContact createContact(AddressBookDataDTO addressBookDataDTO) {
        AddressBookContact addressBookContact = new AddressBookContact(addressBookDataDTO);
        log.info("Contact: ",addressBookContact.toString());
        iAddressBookRepository.save(addressBookContact);
        return addressBookContact;
    }

    @Override
    public AddressBookContact updateContact(int contactId, AddressBookDataDTO addressBookDataDTO) {
        AddressBookContact addressBookContact = new AddressBookContact(contactId, addressBookDataDTO);
        addressBookContact.updateAddressBookContact(addressBookDataDTO);
        return iAddressBookRepository.save(addressBookContact);
    }

    @Override
    public void deleteContact(int contactId) {
        AddressBookContact addressBookContact=this.getContactById(contactId);
        iAddressBookRepository.delete(addressBookContact);
    }
}
