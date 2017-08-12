package com.example.demo.Services.Impl;

import com.example.demo.Domain.Player;
import com.example.demo.Repository.Impl.PlayerRepositoryImpl;
import com.example.demo.Services.PlayerService;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class PlayerServiceImpl implements PlayerService{

    public static PlayerServiceImpl player = null;

    PlayerRepositoryImpl players =  PlayerRepositoryImpl.getInstance();

    public static  PlayerServiceImpl getInstance()
    {
        if(player == null)
            player = new  PlayerServiceImpl();
        return player;
    }
    public Player create(Player player) {
        return players.create(player);
    }

    public Player read(String clubID) {
        return players.read(clubID);
    }

    public Player update(Player player) {
        return players.update(player);
    }

    public void delete(String clubID) {
        players.delete(clubID);
    }
}
