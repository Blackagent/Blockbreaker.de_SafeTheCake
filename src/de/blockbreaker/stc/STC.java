package de.blockbreaker.stc;

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

        this.ConnectMySQL();

        //registerEvents
        //getCommand/Executor
    }

    private void ConnectMySQL() {
        mysql = new MySQL("localhost", "test", "test", "1234");
        mysql.update("CREATE TABLE IF NOT EXISTS Stats(UUID varchar(64), KILLS int, DEATHS int, PUNKTE int)");
    }



    public void onDisable() {

        //==> Konsolenausgabe:
        System.out.println(prefix + "§4Spielmodus nicht bereit!");
    }

    public static STC getInstance () {
        return instance;
    }
}
