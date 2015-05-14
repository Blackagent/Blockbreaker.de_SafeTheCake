package de.blockbreaker.stc;

/**
 * Created by Janne on 14.05.2015.
 */
public class STC {

    //Prefix:
    public static String Prefix  = "&c[Safe&bThe&aCake] ";
    private static STC instance;

    public void onEnable() {
        //==> instance:
        instance = this;




        //==> Konsolenausgabe:
        System.out.println(Prefix + "&2Spielmodus bereit!");
    }

    public static STC getInstance () {
        return instance;
    }
}
