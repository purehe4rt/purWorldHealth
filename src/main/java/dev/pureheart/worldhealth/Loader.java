package dev.pureheart.worldhealth;

import dev.pureheart.worldhealth.listeners.ChangeListener;
import dev.pureheart.worldhealth.listeners.JoinListener;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class Loader extends JavaPlugin {

    private ConfigManager configManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        configManager = new ConfigManager(this);

        new JoinListener(this);
        new ChangeListener(this);
    }
}
