package tmdghks.tutorial;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "플러그인이 활성화 되었습니다.");
        com();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "플러그인이 비활성화 되었습니다.");
    }

    public void com() {
        getCommand("hi").setExecutor(new hi());
    }
}