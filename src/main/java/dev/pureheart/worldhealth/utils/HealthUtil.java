package dev.pureheart.worldhealth.utils;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

public class HealthUtil {

    public static void setHealth(Player player, ConfigurationSection section) {
        String worldName = player.getWorld().getName();

        if (section != null && section.contains(worldName)) {
            double health = section.getDouble(worldName);
            player.setMaxHealth(health);
        }
    }
}
