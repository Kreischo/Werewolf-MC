package core;

import commandsMinecraft.*;
import eventsMinecraft.playerChat;
import net.dv8tion.jda.api.JDA;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;

public class main extends JavaPlugin {

	public static JDA api;

	@Override
	public void onEnable() {
		logMessage("MC-Werewolf wurde geladen");
		initCommands();
		initListeners();
		try {
			discordConnection.discordConnection();
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		logMessage("MC-Werewolf wurde gestoppt");
	}



	public void logMessage(String Message)    {
		getLogger().info(Message);
	}

	public void initCommands()   {
		this.getCommand("create").setExecutor(new createCommand());
		this.getCommand("verify").setExecutor(new verifyCommand());
		this.getCommand("close").setExecutor(new closeCommand());
		this.getCommand("heal").setExecutor(new healCommand());
		this.getCommand("kill").setExecutor(new killCommand());
		this.getCommand("vote").setExecutor(new voteCommand());
		this.getCommand("join").setExecutor(new joinCommand());
		this.getCommand("unverify").setExecutor(new unverifyCommand());

	}

	public void initListeners() {
		getServer().getPluginManager().registerEvents(new playerChat(), this);
	}
}
