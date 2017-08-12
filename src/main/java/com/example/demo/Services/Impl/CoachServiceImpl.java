package com.example.demo.Services.Impl;

import com.example.demo.Domain.Coach;
import com.example.demo.Repository.Impl.CoachRepositoryImpl;
import com.example.demo.Services.CoachService;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class CoachServiceImpl implements CoachService {

    public static CoachServiceImpl coach = null;

    CoachRepositoryImpl coachs =  CoachRepositoryImpl.getInstance();

    public static  CoachServiceImpl getInstance()
    {
        if(coach == null)
            coach = new  CoachServiceImpl();
        return coach;
    }
    public Coach create(Coach coach) {
        return coachs.create(coach);
    }

    public Coach read(String clubID) {
        return coachs.read(clubID);
    }

    public Coach update(Coach coach) {
        return coachs.update(coach);
    }

    public void delete(String clubID) {
        coachs.delete(clubID);
    }
}
