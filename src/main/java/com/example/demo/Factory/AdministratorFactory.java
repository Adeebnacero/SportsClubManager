package com.example.demo.Factory;

import com.example.demo.Domain.Administrator;
import com.example.demo.Domain.ContactDetails;
import com.example.demo.Domain.Wages;

import java.util.List;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class AdministratorFactory {

    public static Administrator getAdministrator (Map<String, String> values, ContactDetails contactDetails, List<Wages> wages){

        Administrator administrator = new Administrator.Builder()
                .clubID(values.get("clubID"))
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .DOB(values.get("DOB"))
                .status(values.get("status"))
                .contactDetails(contactDetails)
                .wages(wages)
                .build();
        return administrator;
    }
}
