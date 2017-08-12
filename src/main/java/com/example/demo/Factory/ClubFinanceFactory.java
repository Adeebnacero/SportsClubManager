package com.example.demo.Factory;

import com.example.demo.Domain.ClubExpense;
import com.example.demo.Domain.ClubFinance;
import com.example.demo.Domain.ClubIncome;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class ClubFinanceFactory {

    public static ClubFinance getClubFinance (Map<String, String> values, Date date, float expenseAmount, List<ClubIncome> clubIncome, List<ClubExpense> clubExpense){

        ClubFinance clubFinance = new ClubFinance.Builder()
                .financeID(values.get("financeID"))
                .date(date)
                .month(values.get("month"))
                .clubIncome(clubIncome)
                .clubExpense(clubExpense)
                .build();

        return clubFinance;
    }
}
