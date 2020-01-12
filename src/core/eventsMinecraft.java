package core;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
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

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)    {

		return true;
	}
}
