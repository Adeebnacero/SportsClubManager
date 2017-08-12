package com.example.demo.Services.Impl;

import com.example.demo.Domain.ContactDetails;
import com.example.demo.Repository.Impl.ContactDetailsRepositoryImpl;
import com.example.demo.Services.ContactDetailsService;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class ContactDetailsServiceImpl implements ContactDetailsService {

    public static ContactDetailsServiceImpl contactDetails = null;

    ContactDetailsRepositoryImpl contactDetail =  ContactDetailsRepositoryImpl.getInstance();

    public static  ContactDetailsServiceImpl getInstance()
    {
        if(contactDetails == null)
            contactDetails = new  ContactDetailsServiceImpl();
        return contactDetails;
    }
    public ContactDetails create(ContactDetails contactDetails) {
        return contactDetail.create(contactDetails);
    }

    public ContactDetails read(String clubID) {
        return contactDetail.read(clubID);
    }

    public ContactDetails update(ContactDetails contactDetails) {
        return contactDetail.update(contactDetails);
    }

    public void delete(String clubID) {
        contactDetail.delete(clubID);
    }
}
