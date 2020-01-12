package core;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;

public class main extends JavaPlugin {
	public static void main(String[] args) {

	}

	@Override
	public void onEnable() {
		System.out.println("MC-Werewolf wurde geladen");
		try {
			disCon();
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		System.out.println("MC-Werewolf wurde gestoppt");
	}

	public void disCon() throws LoginException {
		JDA api = new JDABuilder("NDAwNTgyNzA5ODQ5NjIwNTAw.Xhrf0A.N7lKugfoHNnhhx6-SXDCB6gJG7I")
				.build();
		api.addEventListener(new eventsDiscord());
		System.out.println("Discord wurde über Minecraft connected!");
	}
}
