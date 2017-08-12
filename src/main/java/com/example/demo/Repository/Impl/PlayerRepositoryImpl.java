package com.example.demo.Repository.Impl;

import com.example.demo.Domain.Player;
import com.example.demo.Repository.PlayerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class PlayerRepositoryImpl implements PlayerRepository {

    public static PlayerRepositoryImpl player = null;

    private Map<String, Player> playerTable;

    private PlayerRepositoryImpl(){

        playerTable = new HashMap<String, Player>();
    }

    public static PlayerRepositoryImpl getInstance()
    {
        if(player == null)
            player = new PlayerRepositoryImpl();
        return player;
    }

    public Player create(Player player) {
        playerTable.put(player.getClubID(), player);
        Player savePlayer = playerTable.get(player.getClubID());
        return savePlayer;
    }

    public Player read(String clubID) {
        Player readPlayer = playerTable.get(clubID);
        return readPlayer;
    }

    public Player update(Player player) {
        playerTable.put(player.getClubID(), player);
        Player updatePlayer = playerTable.get(player.getClubID());
        return updatePlayer;
    }

    public void delete(String clubID) {
        playerTable.remove(clubID);
    }
}
