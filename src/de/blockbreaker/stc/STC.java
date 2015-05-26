package de.blockbreaker.stc;

import de.blockbreaker.stc.configmanager.ConfigManager;
import de.blockbreaker.stc.mysql.MySQL;
import org.bukkit.command.CommandExecutor;

/**
 * Created by Janne on 14.05.2015.
 */
public class STC {

    private static STC instance;

    @Override
    public void onEnable() {

        //Config erstellen:
        ConfigManager.createConfig();

        //MySQL
        MySQL.connect();
        MySQL.createTable();

        //registerEvents
        //TODO: Das da------V
        //this.getCommand("stc").setExecutor((CommandExecutor) new Commands());     //Boa Justin ey komm mal in die Gägne ._.

        //Konsolenausgabe:
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.Cprefix + " §erfolgreich geladen");
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.Justin);
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.Janne);
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.BB);
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");

    }


    public void onDisable() {

        //Konsolenausgabe:
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.Cprefix + " §nicht geladen");
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.Justin);
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.Janne);
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(Data.BB);
        System.out.println(" =-=-=-=-=-=-=-=-=-=-=-=");
    }


    public static STC getInstance () {
        return instance;
    }
}
