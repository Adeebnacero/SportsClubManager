package com.example.demo.Factory;

import com.example.demo.Domain.Coach;
import com.example.demo.Domain.ContactDetails;
import com.example.demo.Domain.Wages;

import java.util.List;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class CoachFactory {

    public static Coach getCoach (Map<String, String> values, ContactDetails contactDetails, List<Wages> wages){

        Coach coach = new Coach.Builder()
                .clubID(values.get("clubID"))
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .DOB(values.get("DOB"))
                .status(values.get("status"))
                .contactDetails(contactDetails)
                .wages(wages)
                .build();
        return coach;
    }
}
