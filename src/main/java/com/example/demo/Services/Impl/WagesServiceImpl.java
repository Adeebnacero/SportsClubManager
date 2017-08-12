package com.example.demo.Services.Impl;

import com.example.demo.Domain.Wages;
import com.example.demo.Repository.Impl.WagesRepositoryImpl;
import com.example.demo.Services.WagesService;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class WagesServiceImpl implements WagesService{

    public static WagesServiceImpl wages = null;

    WagesRepositoryImpl wagess =  WagesRepositoryImpl.getInstance();

    public static  WagesServiceImpl getInstance()
    {
        if(wages == null)
            wages = new  WagesServiceImpl();
        return wages;
    }
    public Wages create(Wages wages) {
        return wagess.create(wages);
    }

    public Wages read(String clubID) {
        return wagess.read(clubID);
    }

    public Wages update(Wages wages) {
        return wagess.update(wages);
    }

    public void delete(String clubID) {
        wagess.delete(clubID);
    }
}
