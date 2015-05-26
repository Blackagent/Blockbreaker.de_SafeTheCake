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

        if(cmd.getName().equalsIgnoreCase("stc")) {
            if (args.length == 0) {
                p.sendMessage("§b=-=-=-=-=-§6 STC §4Help §b-=-=-=-=-=");
                p.sendMessage("      &4 /stc setLobby");
                p.sendMessage("      &4 /stc setTeamspawnBlau");
                p.sendMessage("      &4 /stc setTeamspawnRot");
                p.sendMessage("      &4 /stc setTeamspawnGrün");
                p.sendMessage("      &4 /stc setTeamspawnLila");
                p.sendMessage("      &4 /stc removeTeamspawnFARBE<ID>");
                p.sendMessage("      &4 /stc setArena");
                p.sendMessage("      &4 /stc setHaendler");
                p.sendMessage("      &4 /stc setspawner");
                p.sendMessage("§b=-=-=-=-=-§6 STC §4Help §b-=-=-=-=-=");


            }


        }





            return false;
    }
}
