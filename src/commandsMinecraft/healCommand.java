package commandsMinecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;

public class healCommand implements CommandExecutor {
	@EventHandler
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		return true;
	}
}
