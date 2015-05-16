package de.blockbreaker.stc.mysql;

/**
 * Created by 3LaF on 16.05.2015.
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import de.blockbreaker.stc.STC;


public class SQLStats {

    public static boolean playerExists(String uuid){

        try{
            ResultSet rs = MySQL.getResult("SELECT * FROM Stats WHERE uuid= '" + uuid + "'");

            if(rs.next()){
                return rs.getString("uuid") !=null;
            }
            return false;
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void createPlayer(String uuid) {
        if(!(playerExists(uuid))) {
            MySQL.update("INSERT INTO STC-Stats(uuid, kills, deaths) VALUES ('" + uuid + "', '0', '0');");
        }
    }


    public static Integer getKills(String uuid) {
        int kills = 0;

        if(playerExists(uuid)) {

            try{
                ResultSet rs = MySQL.getResult("SELECT * FROM STC-Stats WHERE uuid= '" + uuid + "'");
                if((!rs.next()) || (Integer.valueOf(rs.getInt("kills")) == null ));

                kills = rs.getInt("kills");

            }catch(SQLException e) {
                e.printStackTrace();
            }


        }else {
            createPlayer(uuid);
            getKills(uuid);

        }
        return kills;
    }

    public static Integer getDeaths(String uuid) {
        int deaths = 0;

        if(playerExists(uuid)) {

            try{
                ResultSet rs = MySQL.getResult("SELECT * FROM STC-Stats WHERE uuid= '" + uuid + "'");
                if((!rs.next()) || (Integer.valueOf(rs.getInt("deaths")) == null ));

                deaths = rs.getInt("deaths");

            }catch(SQLException e) {
                e.printStackTrace();
            }


        }else {
            createPlayer(uuid);
            getDeaths(uuid);

        }
        return deaths;
    }

    public static void setKills(String uuid, Integer kills) {
        if (playerExists(uuid)) {
            MySQL.update("UPDATE STC-Stats SET KILLS= '" + kills + "' WHERE UUID= '" + uuid + "';");
        } else {
            createPlayer(uuid);
            setKills(uuid, kills);
        }
    }

    public static void setDeaths(String uuid, Integer deaths) {
        if (playerExists(uuid)) {
            STC.mysql.update("UPDATE Stats SET DEATHS= '" + deaths + "' WHERE UUID= '" + uuid + "';");
        } else {
            createPlayer(uuid);
            setDeaths(uuid, deaths);
        }
    }

    public static void addKills(String uuid, Integer kills) {
        if(playerExists(uuid)){
            setKills(uuid, Integer.valueOf(getKills(uuid).intValue() + kills.intValue()));
        }else{
            createPlayer(uuid);
            addKills(uuid, kills);
        }

    }

    public static void addDeaths(String uuid, Integer deaths) {
        if(playerExists(uuid)){
            setDeaths(uuid, Integer.valueOf(getDeaths(uuid).intValue() + deaths.intValue()));
        }else{
            createPlayer(uuid);
            addKills(uuid, deaths);
        }

    }

    public static void removeKills(String uuid, Integer kills) {
        if(playerExists(uuid)){
            setKills(uuid, Integer.valueOf(getKills(uuid).intValue() - kills.intValue()));
        }else{
            createPlayer(uuid);
            removeKills(uuid, kills);
        }

    }

    public static void removeDeaths(String uuid, Integer deaths) {
        if(playerExists(uuid)){
            setDeaths(uuid, Integer.valueOf(getKills(uuid).intValue() - deaths.intValue()));
        }else{
            createPlayer(uuid);
            removeDeaths(uuid, deaths);
        }

    }
}



