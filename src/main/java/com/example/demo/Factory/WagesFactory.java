package com.example.demo.Factory;

import com.example.demo.Domain.Wages;

import java.util.Date;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class WagesFactory {

    public static Wages getWages (Map<String, String> values, Date date, int hours, double rate){

        Wages wages = new Wages.Builder()
                .wageID(values.get("wageID"))
                .date(date)
                .hours(hours)
                .rate(rate)
                .build();
        return wages;
    }
}
