package core;

import eventsDiscord.guildMessageReceived;
import eventsDiscord.privateMessageReceived;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

import static core.main.api;

public class discordConnection {

	public static void discordConnection() throws LoginException {
		api = new JDABuilder("")
				.build();
	}

	public void initListeners() {
		api.addEventListener(new guildMessageReceived());
		api.addEventListener(new privateMessageReceived());
	}
}
