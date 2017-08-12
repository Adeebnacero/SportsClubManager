package com.example.demo.Repository;

import com.example.demo.Domain.Wages;

/**
 * Created by Adeebo on 2017/08/12.
 */
public interface WagesRepository {

    Wages create(Wages wage);
    Wages read(String wageID);
    Wages update(Wages wage);
    void delete(String wageID);
}
