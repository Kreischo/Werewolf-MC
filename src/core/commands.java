package core;

import net.dv8tion.jda.api.entities.Invite;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class commands extends JavaPlugin {
	public static void writeMC(String Message) {
		Bukkit.broadcastMessage(Message);
	}

	public static void writeDC(String Message) {

	}

}
