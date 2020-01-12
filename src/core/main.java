package core;

import commands.create;
import commands.verify;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;

public class main extends JavaPlugin {

	public static JDA api;

	@Override
	public void onEnable() {
		logMessage("MC-Werewolf wurde geladen");
		getServer().getPluginManager().registerEvents(new eventsMinecraft(), this);
		this.getCommand("create").setExecutor(new create());
		this.getCommand("verify").setExecutor(new verify());
		try {
			discordConnection();
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		logMessage("MC-Werewolf wurde gestoppt");
	}

	public void discordConnection() throws LoginException {
		api = new JDABuilder("")
				.build();
		api.addEventListener(new eventsDiscord());
		logMessage("Discord wurde über Minecraft connected");
	}

	public void logMessage(String Message)    {
		getLogger().info(Message);
	}
}
