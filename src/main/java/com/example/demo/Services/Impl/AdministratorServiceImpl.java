package com.example.demo.Services.Impl;

import com.example.demo.Domain.Administrator;
import com.example.demo.Repository.Impl.AdministratorRepositoryImpl;
import com.example.demo.Services.AdministratorService;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class AdministratorServiceImpl implements AdministratorService {

    public static AdministratorServiceImpl administrator = null;

    AdministratorRepositoryImpl administrators =  AdministratorRepositoryImpl.getInstance();

    public static  AdministratorServiceImpl getInstance()
    {
        if(administrator == null)
            administrator = new  AdministratorServiceImpl();
        return administrator;
    }
    public Administrator create(Administrator administrator) {
        return administrators.create(administrator);
    }

    public Administrator read(String clubID) {
        return administrators.read(clubID);
    }

    public Administrator update(Administrator administrator) {
        return administrators.update(administrator);
    }

    public void delete(String clubID) {
        administrators.delete(clubID);
    }
}
