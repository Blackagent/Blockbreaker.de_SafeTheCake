package de.blockbreaker.stc;

/**
 * Created by Janne on 14.05.2015.
 */
public class STC {

    //prefix:
    public static String prefix = "§c[Safe§bThe§aCake] ";

    private static STC instance;

    public void onEnable() {
        //==> instance:
        instance = this;




        //==> Konsolenausgabe:
        System.out.println(prefix + "§2Spielmodus bereit!");
    }



    public void onDisable() {

        //==> Konsolenausgabe:
        System.out.println(prefix + "§4Spielmodus nicht bereit!");
    }

    public static STC getInstance () {
        return instance;
    }
}
