package dev.pureheart.worldhealth;

import lombok.Getter;
import org.bukkit.configuration.ConfigurationSection;

@Getter
public class ConfigManager {

    private final Loader plugin;

    public ConfigManager(Loader plugin) {
        this.plugin = plugin;
        apply();
    }

    private ConfigurationSection worldSection;
    private boolean worldChange;

    public void apply() {
        plugin.reloadConfig();

        worldSection = plugin.getConfig().getConfigurationSection("worldHealth");
        worldChange = plugin.getConfig().getBoolean("worldChange", false);
    }
}
