package com.example.demo.Repository;

import com.example.demo.Domain.Coach;

/**
 * Created by Adeebo on 2017/08/12.
 */
public interface CoachRepository {

    Coach create(Coach coach);
    Coach read(String clubID);
    Coach update(Coach coach);
    void delete(String clubID);
}
