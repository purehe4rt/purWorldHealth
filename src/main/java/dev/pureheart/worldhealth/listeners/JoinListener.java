package dev.pureheart.worldhealth.listeners;

import dev.pureheart.worldhealth.Loader;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    private final Loader plugin;

    public JoinListener(Loader plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String worldName = player.getWorld().getName();

        ConfigurationSection worldSection = plugin.getConfig().getConfigurationSection("worldHealth");

        if (worldSection != null && worldSection.contains(worldName)) {
            double health = worldSection.getDouble(worldName);
            player.setMaxHealth(health);
        }
    }
}
