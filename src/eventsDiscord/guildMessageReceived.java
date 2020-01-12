package eventsDiscord;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;
import java.util.Random;

public class guildMessageReceived extends ListenerAdapter {

	HashMap<String, String> hashs = new HashMap<String, String>();

	@Override
	//Löst aus, wenn der Bot eine Nachricht auf einem Server empfängt
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		//guckt sich die Nachricht nur an, wenn sie von einem User stammt
		if (!event.getAuthor().isBot()) {

		}
	}
}