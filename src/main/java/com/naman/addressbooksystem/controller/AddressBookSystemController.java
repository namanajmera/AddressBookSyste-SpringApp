package com.naman.addressbooksystem.controller;

import com.naman.addressbooksystem.dto.AddressBookDataDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookSystemController {

//    Get All Data
    @RequestMapping(value = {"","/","/getAll"})
    public ResponseEntity<String> getAddressBookAllContact(){
        return new ResponseEntity<>("Get Call Success", HttpStatus.OK);
    }

//    Get Data By ID
    @GetMapping(value = {"/get/{contactId}"})
    public ResponseEntity<String> getAddressBookContact(@PathVariable("contactId") int contactId){
        return new ResponseEntity<>("Get Call Success:- "+contactId, HttpStatus.OK);
    }

//    Post Call
    @PostMapping(value = {"/post/create"})
    public ResponseEntity<String> createAddressBookContact(@RequestBody AddressBookDataDTO addressBookDataDTO){
        return new ResponseEntity<>("Post Call Success"+addressBookDataDTO,HttpStatus.CREATED);
    }

//    Put Call
    @PutMapping(value = {"/put/update/{contactId}"})
    public ResponseEntity<String> updateAddressBookContact(@PathVariable("contactId") int contactId,@RequestBody AddressBookDataDTO addressBookDataDTO){
        return new ResponseEntity<>("Put Call Success "+contactId+":- "+addressBookDataDTO,HttpStatus.CREATED);
    }

//    Delete Call
    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<String> deleteAddressBookContact(@PathVariable("contactId") int contactId){
        return new ResponseEntity<>("Delete Call Success "+contactId,HttpStatus.OK);
    }
}
