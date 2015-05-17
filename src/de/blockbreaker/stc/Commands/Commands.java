package de.blockbreaker.stc.Commands;

import de.blockbreaker.stc.Data;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by 3LaF on 17.05.2015.
 */
public class Commands implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if(!(sender instanceof Player)) {
            System.out.println(Data.Cprefix + "Du musst ein Spieler sein um STC Commands nutzen zu können!");
            return true;
        }

        if(cmd.getName().equalsIgnoreCase("stc")){
            if(args.length == 0){
                p.sendMessage("§b=-=-=-=-=-§6 STC §4Help §b-=-=-=-=-=");
                p.sendMessage("           &4 /stc set lobby");
                p.sendMessage("           &4 /stc set teamspawn <farbe>");
                p.sendMessage("           &4 /stc remove teamspawn <farbe> <id>");
                p.sendMessage("           &4 /stc set Arena");
                p.sendMessage("           &4 /stc set Händler");
                p.sendMessage("           &4 /stc set spawner <art>");
                p.sendMessage("§b=-=-=-=-=-§6 STC §4Help §b-=-=-=-=-=");


            }

        }


        return false;
    }
}
