package de.blockbreaker.stc.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Janne on 14.05.2015.
 */
public class JoinListener implements Listener{

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        Bukkit.broadcastMessage("&a" + p + " &7hat &bHunger &7auf &aKuchen!");


    }

}
