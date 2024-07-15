package fr.lutamc.lutacore.manager;

import fr.lutamc.lutacore.Main;
import fr.lutamc.lutacore.commands.RankCommand;
import fr.lutamc.lutacore.commands.SetrankCommand;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Register {

    private static void RegisterListener(Listener L, JavaPlugin J){
        J.getServer().getPluginManager().registerEvents(L,J);

    }
    private static void RegisterCommand(CommandExecutor C, JavaPlugin J, String name){
        J.getCommand(name).setExecutor(C);
    }
    public static void RegisterAll(){
       // RegisterListener(new JoinQuitEvent(), main.getInstance());
        RegisterCommand(new SetrankCommand(), Main.getInstance(), "setrank");
        RegisterCommand(new RankCommand(), Main.getInstance(), "rank");



    }
}
