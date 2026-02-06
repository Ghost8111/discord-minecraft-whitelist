package me.notaghost.whitelist;

import org.bukkit.plugin.java.JavaPlugin;

public class DiscordWhitelist extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DiscordWhitelist enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("DiscordWhitelist disabled");
    }
}

