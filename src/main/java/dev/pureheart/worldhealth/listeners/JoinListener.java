package dev.pureheart.worldhealth.listeners;

import dev.pureheart.worldhealth.Loader;
import dev.pureheart.worldhealth.utils.HealthUtil;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    private final Loader plugin;

    public JoinListener(Loader plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        HealthUtil.setHealth(event.getPlayer(), plugin.getConfigManager().getWorldSection());
    }
}
