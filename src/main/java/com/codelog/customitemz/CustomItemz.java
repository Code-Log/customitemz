package com.codelog.customitemz;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class CustomItemz extends JavaPlugin {

    protected static Logger logger;

    @Override
    public void onEnable() {
        logger = getLogger();
        getLogger().info("Custom Itemz Enable Called");

        var mainCommand = this.getCommand("citemz");
        if (mainCommand != null)
            mainCommand.setExecutor(new MainCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Custom Itemz Disable Called!");
    }
}
