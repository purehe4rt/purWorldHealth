package dev.pureheart.worldhealth.listeners;

import dev.pureheart.worldhealth.Loader;
import dev.pureheart.worldhealth.utils.HealthUtil;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class ChangeListener implements Listener {

    private final Loader plugin;

    public ChangeListener(Loader plugin) {
        this.plugin = plugin;

        if (plugin.getConfigManager().isWorldChange()) {
            plugin.getServer().getPluginManager().registerEvents(this, plugin);
        }
    }

    @EventHandler
    public void onChange(PlayerChangedWorldEvent event) {
        if (plugin.getConfigManager().isWorldChange()) {
            HealthUtil.setHealth(event.getPlayer(), plugin.getConfigManager().getWorldSection());
        }
    }
}
