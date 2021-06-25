package com.naman.addressbooksystem.repository;

import com.naman.addressbooksystem.model.AddressBookContact;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressBookRepository extends JpaRepository<AddressBookContact, Integer> {

}
