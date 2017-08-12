package com.example.demo.Services;

import com.example.demo.Domain.Player;

/**
 * Created by Adeebo on 2017/08/12.
 */
public interface PlayerService {

    Player create(Player player);
    Player read(String clubID);
    Player update(Player player);
    void delete(String clubID);
}
