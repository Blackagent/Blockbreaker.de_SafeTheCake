package de.blockbreaker.stc;

import de.blockbreaker.stc.mysql.MySQL;
import org.bukkit.command.CommandExecutor;

/**
 * Created by Janne on 14.05.2015.
 */
public class STC {

    private static STC instance;

    @Override
    public void onEnable() {
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.Cprefix + " erfolgreich geladen");
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.Justin);
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.Janne);
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.BB + " erfolgreich geladen [by 3LaF]");
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");

        //MySQL
        MySQL.connect();
        MySQL.createTable();



        //registerEvents
        this.getCommand("stc").setExecutor((CommandExecutor) new Commands());    }



    public void onDisable() {

        //Konsolenausgabe:
        System.out.println(Data.Cprefix + "§4Spielmodus nicht bereit!");
    }

    public static STC getInstance () {

        return instance;
    }
}
