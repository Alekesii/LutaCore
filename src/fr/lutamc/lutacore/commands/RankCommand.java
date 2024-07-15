package fr.lutamc.lutacore.commands;

import fr.lutamc.lutacore.utils.ERank;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;

public class RankCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(sender.isOp()){
            ArrayList<ERank> ranksArray = new ArrayList<>();
            for(ERank eRank : ERank.values()) {
                ranksArray.add(eRank);
                sender.sendMessage(String.valueOf(eRank.getAllias(eRank)));
            }


        } else{
            sender.sendMessage("§5§lLutaCore "+ ChatColor.WHITE + "§l►" + ChatColor.RED + " Erreur, vous n'avez pas la permission requise");
        }

        return true;
    }

}
