package com.example.demo.Repository.Impl;

import com.example.demo.Domain.ContactDetails;
import com.example.demo.Repository.ContactDetailsRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class ContactDetailsRepositoryImpl implements ContactDetailsRepository {

    public static ContactDetailsRepositoryImpl contactDetails = null;

    private Map<String, ContactDetails> contactDetailsTable;

    private ContactDetailsRepositoryImpl(){

        contactDetailsTable = new HashMap<String, ContactDetails>();
    }

    public static ContactDetailsRepositoryImpl getInstance()
    {
        if(contactDetails == null)
            contactDetails = new ContactDetailsRepositoryImpl();
        return contactDetails;
    }

    public ContactDetails create(ContactDetails contactDetails) {
        contactDetailsTable.put(contactDetails.getPlayerContactNumber(), contactDetails);
        ContactDetails saveContactDetails = contactDetailsTable.get(contactDetails.getPlayerContactNumber());
        return saveContactDetails;
    }

    public ContactDetails read(String clubID) {
        ContactDetails readContactDetails = contactDetailsTable.get(clubID);
        return readContactDetails;
    }

    public ContactDetails update(ContactDetails contactDetails) {
        contactDetailsTable.put(contactDetails.getPlayerContactNumber(), contactDetails);
        ContactDetails updateContactDetails = contactDetailsTable.get(contactDetails.getPlayerContactNumber());
        return updateContactDetails;
    }

    public void delete(String clubID) {
        contactDetailsTable.remove(clubID);
    }
}
