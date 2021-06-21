package com.naman.addressbooksystem.controller;

import com.naman.addressbooksystem.dto.AddressBookDataDTO;
import com.naman.addressbooksystem.dto.ResponseDTO;
import com.naman.addressbooksystem.model.AddressBookContact;
import com.naman.addressbooksystem.service.IAddressBookContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookSystemController {

    @Autowired
    private IAddressBookContactService iAddressBookContactService;

    //    Get All Data
    @RequestMapping(value = {"", "/", "/getAll"})
    public ResponseEntity<ResponseDTO> getAddressBookAllContact() {
        List<AddressBookContact> addressBookContacts = iAddressBookContactService.getAllContact();
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success", addressBookContacts);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //    Get Data By ID
    @GetMapping(value = {"/get/{contactId}"})
    public ResponseEntity<ResponseDTO> getAddressBookContact(@PathVariable("contactId") int contactId) {
        AddressBookContact addressBookContact = iAddressBookContactService.getContactById(contactId);
        ResponseDTO responseDTO = new ResponseDTO("GGet Call Success", addressBookContact);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    //    Post Call
    @PostMapping(value = {"/post/create"})
    public ResponseEntity<ResponseDTO> createAddressBookContact(@RequestBody AddressBookDataDTO addressBookDataDTO) {
        AddressBookContact addressBookContact = iAddressBookContactService.createContact(addressBookDataDTO);
        ResponseDTO responseDTO = new ResponseDTO("Post call Success", addressBookContact);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    //    Put Call
    @PutMapping(value = {"/put/update/{contactId}"})
    public ResponseEntity<ResponseDTO> updateAddressBookContact(@PathVariable("contactId") int contactId, @RequestBody AddressBookDataDTO addressBookDataDTO) {
        AddressBookContact addressBookContact = iAddressBookContactService.updateContact(contactId, addressBookDataDTO);
        ResponseDTO responseDTO = new ResponseDTO("Put Call Success", addressBookContact);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    //    Delete Call
    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookContact(@PathVariable("contactId") int contactId) {
        iAddressBookContactService.deleteContact(contactId);
        ResponseDTO responseDTO = new ResponseDTO("Delete Call Success", contactId);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
