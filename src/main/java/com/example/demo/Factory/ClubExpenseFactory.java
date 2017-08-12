package com.example.demo.Factory;

import com.example.demo.Domain.Administrator;
import com.example.demo.Domain.ClubExpense;

import java.util.Date;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class ClubExpenseFactory {

    public static ClubExpense getClubExpense (Map<String, String> values, Date date, float expenseAmount, float expenseTotal, Administrator administrator){

        ClubExpense clubExpense = new ClubExpense.Builder()
                .expenseID(values.get("expenseID"))
                .date(date)
                .expenseName(values.get("expenseName"))
                .expenseDescription(values.get("expenseDescription"))
                .expenseAmount(expenseAmount)
                .expenseTotal(expenseTotal)
                .expenseAuthorization(values.get("expenseAuthorization"))
                .administrator(administrator)
                .build();

        return clubExpense;
    }
}
