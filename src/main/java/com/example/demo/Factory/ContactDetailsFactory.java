package com.example.demo.Factory;

import com.example.demo.Domain.ContactDetails;

import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class ContactDetailsFactory {

    public static ContactDetails getContactDetails (Map<String, String> values) {

        ContactDetails contactDetails = new ContactDetails.Builder()
                .playerContactNumber(values.get("playerContactNumber"))
                .contactFirstName(values.get("contactFirstName"))
                .contactLastName(values.get("contactLastName"))
                .relationship(values.get("relationship"))
                .contactHomeNumber(values.get("contactHomeNumber"))
                .contactCellphoneNumber(values.get("contactCellphoneNumber"))
                .build();

        return contactDetails;
    }
}
