package core;

import net.dv8tion.jda.api.entities.Invite;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class actions extends JavaPlugin {

	//Eine Nachricht in den Minecraft-Chat Broadcasten
	public static void writeMC(String Message) {
		Bukkit.broadcastMessage(Message);
	}

	//Eine Nachricht des Bots in einen Discord Channel
	public static void writeDC(String Message) {
		main.api.getTextChannelById("475433172998291456").sendMessage(Message).queue();
	}

}
