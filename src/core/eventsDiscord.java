package core;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class eventsDiscord extends ListenerAdapter {
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		if (!event.getAuthor().isBot()) {
			System.out.println("Message Received");
			if (event.getMessage().getContentRaw().startsWith("/token")) {
				System.out.println("Message = /token");
				int ID = event.getAuthor().getId().hashCode();
				event.getChannel().sendMessage("token = " + ID).queue();
				System.out.println("Message = sent");
			}
		}
	}
}