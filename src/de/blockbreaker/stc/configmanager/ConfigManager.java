package de.blockbreaker.stc.configmanager;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

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



    }

}
