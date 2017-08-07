package com.example.demo.Factory;

import com.example.demo.Domain.ContactDetails;
import com.example.demo.Domain.Player;
import com.example.demo.Domain.PlayerSubscription;

import java.util.List;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/06.
 */
public class PlayerFactory {

    public static Player getPlayer (Map<String, String> values, ContactDetails contactDetails, List<PlayerSubscription> playerSubscription){

        Player player = new Player.Builder()
                .clubID(values.get("clubID"))
                .firstName(values.get("firstName"))
                .lastName(values.get("lastName"))
                .DOB(values.get("DOB"))
                .ID(0)
                .position(values.get("position"))
                .strongFoot(values.get("strongFoot"))
                .status(values.get("status"))
                .contactDetails(contactDetails)
                .playerSubscription(playerSubscription)
                .build();
        return player;
    }
}


