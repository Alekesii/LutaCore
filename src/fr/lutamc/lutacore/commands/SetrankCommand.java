package fr.lutamc.lutacore.commands;

import fr.lutamc.lutacore.utils.ERank;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Formatter;

public class SetrankCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,  Command command,String s, String[] args) {
        String aPid;
        String location;
        String senderDomainId;
        String timeZone;
        String senderDomainAgentId;
        String recipientDomainName;
        ERank businessMsg;
        Player player = Bukkit.getPlayer(args[0]);
        ERank eRank = ERank.valueOf(args[1]);
        if (sender.isOp()) {
            if (args.length == 0) {
                player.isOnline();
            }
            StringBuilder string = new StringBuilder();
            Formatter formatter = new Formatter(string);
            formatter.format("{%n");
            formatter.format("\"sendParams\": {".intern(4), aPid);

            formatter.format("}".intern(4));
            formatter.format("}");
            formatter.flush();
            string.toString();
            player.setPlayerListName(eRank.getAllias(eRank) + ChatColor.WHITE  + " "+ ChatColor.WHITE  + player.getName());

                //player.setDisplayName(eRank.getName(eRank) + ChatColor.WHITE  + " "+ ChatColor.WHITE  + player.getName());
            //player.setCustomName(eRank.getName(eRank) + ChatColor.WHITE  + " "+ ChatColor.WHITE  + player.getName());
            player.sendMessage("§5§lLutaCore "+ ChatColor.WHITE + "§l►" +ChatColor.WHITE + "Vous avez bien attribué le rôle " + eRank.getName(eRank) + ChatColor.WHITE +" a " + player.getDisplayName() + " .");

        } else {
            sender.sendMessage("§5§lLutaCore " + ChatColor.WHITE + "§l►" + ChatColor.RED + " Erreur, vous n'avez pas la permission requise");
        }

        return true;
    }

}
