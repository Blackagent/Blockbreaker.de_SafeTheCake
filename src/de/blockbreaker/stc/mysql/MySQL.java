package de.blockbreaker.stc.mysql;

import de.blockbreaker.paintball.Paintball;
import de.blockbreaker.stc.STC;
import org.bukkit.Bukkit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL {

    public static String username;
    public static String password;
    public static String database;
    public static String host;
    public static String port;
    public static Connection con;

//==============================================================================//

    public static boolean isConnected() {
        return con != null;
    }

//==============================================================================//

    public static void connect() {
        if(!isConnected()){
            try {
                con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, username, password);
                Bukkit.getConsoleSender().sendMessage(STC.getInstance().prefix + "MySQL Verbindung aufgebaut!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public static void close() {
        if(isConnected()) {
            try {
                con.close();
                Bukkit.getConsoleSender().sendMessage(STC.getInstance().prefix + "MySQL Verbindung geschlossen!");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

//==============================================================================//

    public static void createTable() {





    public static void update(String qry) {
        if(isConnected()) {
            try {
                con.createStatement().executeUpdate(qry);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public static ResultSet getResult(String qry) {
        if(isConnected()) {
            try {
                return con.createStatement().executeQuery(qry);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
