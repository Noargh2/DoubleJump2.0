package n0devx.doublejumppl;

import org.bukkit.plugin.java.JavaPlugin;

public final class DoubleJumpPl extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DoubleJump(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
