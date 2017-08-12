package com.example.demo.Repository;

import com.example.demo.Domain.Administrator;

/**
 * Created by Adeebo on 2017/08/12.
 */
public interface AdministratorRepository {

    Administrator create(Administrator admin);
    Administrator read(String clubID);
    Administrator update(Administrator admin);
    void delete(String clubID);
}
