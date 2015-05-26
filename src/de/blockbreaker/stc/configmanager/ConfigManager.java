package de.blockbreaker.stc.configmanager;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * Created by Janne on 26.05.2015.
 */
public class ConfigManager {

    public static File file;
    public static FileConfiguration cfg;

    static {
    file=new File("plugins/SafeTheCake","config.yml");
    cfg=YamlConfiguration.loadConfiguration(file);
    }

    public static void createConfig() {

        if(!file.exists()) {
            //!!!!!!!!!!!!!!
            try {
                cfg.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
