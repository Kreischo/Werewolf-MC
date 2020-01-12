package core;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class eventsDiscord extends ListenerAdapter {
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		if (!event.getAuthor().isBot()) {
			if (event.getChannel().getId().equals("475433172998291456")) {
				String msg[] = event.getMessage().getContentRaw().split(" ");
				String newMsg = event.getAuthor().getName();
				for(int i = 0; i < msg.length; i++) {
					newMsg = newMsg + " " + msg[i];
				}
				newMsg = "<Discord>: " + newMsg;
				commands.writeMC(newMsg);
			}
		}
	}
}