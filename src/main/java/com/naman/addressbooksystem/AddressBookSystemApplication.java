package com.naman.addressbooksystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AddressBookSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressBookSystemApplication.class, args);
        log.info("Address Book App Started.");
    }

}
