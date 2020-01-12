package eventsDiscord;

import commandsDiscord.verifyCommand;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class privateMessageReceived extends ListenerAdapter {

	@Override
	public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
		if (!event.getAuthor().isBot()) {

			//Verify Command
			if (event.getMessage().getContentRaw().equalsIgnoreCase("/verify")) {
				verifyCommand.verify(event);
			}

			//xxx Command
		}
	}
}
