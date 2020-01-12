package core;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;
import java.util.Random;

public class eventsDiscord extends ListenerAdapter {

	Random r = new Random();
	HashMap<String, String> hashs = new HashMap<String, String>();

	@Override
	//Löst aus, wenn der Bot eine Nachricht auf einem Server empfängt
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		//guckt sich die Nachricht nur an, wenn sie von einem User stammt
		if (!event.getAuthor().isBot()) {

		}
	}

	@Override
	public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
		if (!event.getAuthor().isBot()) {
			// Verify Command
			if (event.getMessage().getContentRaw().equalsIgnoreCase("/verify")) {
				//sendet dem User, der den Command ausfgeführt hat einen Unique Hash
				//Speichert sowohl Discord ID als auch Hash in einer HashMap.
				int hash = (int) event.getAuthor().getIdLong() * r.nextInt((42 - 0) + 1);
				hashs.putIfAbsent(event.getAuthor().getId(), String.valueOf(hash));
				event.getChannel().sendMessage("Sende die Nachricht ''/verify " + hash + "'' auf dem Minecraft-Server").queue();
			}
		}
	}
}