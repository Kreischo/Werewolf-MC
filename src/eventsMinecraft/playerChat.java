package eventsMinecraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class playerChat implements Listener {

	@EventHandler
	public boolean onPlayerChat(AsyncPlayerChatEvent event) {

		return true;
	}
}
