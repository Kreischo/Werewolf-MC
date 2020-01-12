package core;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;

public class main extends JavaPlugin {

	public static JDA api;

	public static void main(String[] args) {

	}

	@Override
	public void onEnable() {
		System.out.println("MC-Werewolf wurde geladen");
		getServer().getPluginManager().registerEvents(new eventsMinecraft(), this);
		try {
			discordConnection();
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		System.out.println("MC-Werewolf wurde gestoppt");
	}

	public void discordConnection() throws LoginException {
		api = new JDABuilder("")
				.build();
		api.addEventListener(new eventsDiscord());
		getLogger().info("Discord wurde über Minecraft connected");
	}
}
