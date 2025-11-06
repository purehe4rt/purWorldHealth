package dev.pureheart.worldhealth;

import dev.pureheart.worldhealth.listeners.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Loader extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new JoinListener(this), this);
    }
}
