package com.example.demo.Factory;

import com.example.demo.Domain.ClubIncome;

import java.util.Date;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class ClubIncomeFactory {

    public static ClubIncome getClubIncome (Map<String, String> values, Date date, float incomeAmount, float incomeVAT, float incomeTotal){

        ClubIncome clubIncome = new ClubIncome.Builder()
                .incomeID(values.get("incomeID"))
                .date(date)
                .incomeName(values.get("incomeName"))
                .incomeDescription(values.get("incomeDescription"))
                .incomeAmount(incomeAmount)
                .incomeVAT(incomeVAT)
                .incomeTotal(incomeTotal)
                .build();

        return clubIncome;
    }
}
