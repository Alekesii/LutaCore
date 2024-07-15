package fr.lutamc.lutacore;

import fr.lutamc.lutacore.manager.Register;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;

    public void onEnable(){
        instance = this;
        Register.RegisterAll();
        System.out.println("LutaCore is online");
    }
    public static Main getInstance() {
        return instance;
    }

}