package com.example.demo.Repository.Impl;

import com.example.demo.Domain.Administrator;
import com.example.demo.Repository.AdministratorRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class AdministratorRepositoryImpl implements AdministratorRepository {

    public static AdministratorRepositoryImpl administrator = null;

    private Map<String, Administrator> administratorTable;

    private AdministratorRepositoryImpl(){

        administratorTable = new HashMap<String, Administrator>();
    }

    public static AdministratorRepositoryImpl getInstance()
    {
        if(administrator == null)
            administrator = new AdministratorRepositoryImpl();
        return administrator;
    }

    public Administrator create(Administrator administrator) {
        administratorTable.put(administrator.getClubID(), administrator);
        Administrator saveAdministrator = administratorTable.get(administrator.getClubID());
        return saveAdministrator;
    }

    public Administrator read(String clubID) {
        Administrator readAdministrator = administratorTable.get(clubID);
        return readAdministrator;
    }

    public Administrator update(Administrator administrator) {
        administratorTable.put(administrator.getClubID(), administrator);
        Administrator updateAdministrator = administratorTable.get(administrator.getClubID());
        return updateAdministrator;
    }

    public void delete(String clubID) {
        administratorTable.remove(clubID);
    }
}
