package dev;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

public class Main extends JavaPlugin{
    @Override
    public void onEnable() {
        this.registerEvents();
    }
    @Override
    public void onDisable() {
        //System.out.println("printed");
    }

    private void registerEvents() {
        PluginManager pluginManager = getServer().getPluginManager();
        
        pluginManager.registerEvents(new Snow(), this);

    }
    
}
