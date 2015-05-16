package de.blockbreaker.stc;

import de.blockbreaker.stc.mysql.MySQL;

/**
 * Created by Janne on 14.05.2015.
 */
public class STC {

    //prefix:
    public static String prefix = "§c[Safe§bThe§aCake] ";

    private static STC instance;

    @Override
    public void onEnable() {
        System.out.println(prefix + " erfolgreich geladen [by 3LaF]");

        //MySQL
        MySQL.connect();
        MySQL.createTable();



        //registerEvents
        //getCommand/Executor
    }



    public void onDisable() {

        //Konsolenausgabe:
        System.out.println(prefix + "§4Spielmodus nicht bereit!");
    }

    public static STC getInstance () {
        return instance;
    }
}
