package commandsDiscord;

import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;

import java.util.HashMap;
import java.util.Random;

public class verifyCommand {

	Random r = new Random();
	public HashMap<String, String> hashs = new HashMap<String, String>();

	public void verify(PrivateMessageReceivedEvent event) {
		int hash = (int) event.getAuthor().getIdLong() * r.nextInt((42 - 0) + 1);
		hashs.putIfAbsent(event.getAuthor().getId(), String.valueOf(hash));
		event.getChannel().sendMessage("Sende die Nachricht ''/verify " + hash + "'' auf dem Minecraft-Server").queue();
	}
}
