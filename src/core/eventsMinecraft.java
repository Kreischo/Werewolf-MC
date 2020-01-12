package core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class eventsMinecraft implements Listener {

	@EventHandler
	public boolean onPlayerChat(AsyncPlayerChatEvent event)    {
		String Message = "<Minecraft>: " + event.getPlayer().getName() + event.getMessage();
		commands.writeDC(Message);
		return true;
	}
}
