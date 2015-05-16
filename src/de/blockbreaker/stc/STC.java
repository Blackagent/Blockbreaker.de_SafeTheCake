package de.blockbreaker.stc;

/**
 * Created by Janne on 14.05.2015.
 */
public class STC {

    private static STC instance;

    public void onEnable() {
        //==> instance:
        instance = this;


        //==> Konsolenausgabe:
        System.out.println(Data.Prefix + "§2Spielmodus bereit!");
    }



    public void onDisable() {

        //==> Konsolenausgabe:
        System.out.println("Data.Prefix + §4Spielmodus nicht bereit!");
    }

    public static STC getInstance () {
        return instance;
    }
}
