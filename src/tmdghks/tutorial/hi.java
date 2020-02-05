package tmdghks.tutorial;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class hi implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if(args.length==0) {
                player.sendMessage("Hello");
            } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("give")) {
                    player.getInventory().addItem(new ItemStack(Material.STONE_AXE));
                    player.sendMessage("Stone Axe is received");
                }
            }
            else {
                player.chat("I wrote a wrong command");
            }
        }
        else {
            sender.sendMessage("You cannot use this command unless you are a player.");
        }
        return false;
    }
}
