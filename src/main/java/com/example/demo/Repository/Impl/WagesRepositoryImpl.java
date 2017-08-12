package com.example.demo.Repository.Impl;

import com.example.demo.Domain.Wages;
import com.example.demo.Repository.WagesRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class WagesRepositoryImpl implements WagesRepository {

    public static WagesRepositoryImpl wages = null;

    private Map<String, Wages> wagesTable;

    private WagesRepositoryImpl(){

        wagesTable = new HashMap<String, Wages>();
    }

    public static WagesRepositoryImpl getInstance()
    {
        if(wages == null)
            wages = new WagesRepositoryImpl();
        return wages;
    }

    public Wages create(Wages wages) {
        wagesTable.put(wages.getWageID(), wages);
        Wages saveWages = wagesTable.get(wages.getWageID());
        return saveWages;
    }

    public Wages read(String clubID) {
        Wages readWages = wagesTable.get(clubID);
        return readWages;
    }

    public Wages update(Wages wages) {
        wagesTable.put(wages.getWageID(), wages);
        Wages updateWages = wagesTable.get(wages.getWageID());
        return updateWages;
    }

    public void delete(String clubID) {
        wagesTable.remove(clubID);
    }
}
