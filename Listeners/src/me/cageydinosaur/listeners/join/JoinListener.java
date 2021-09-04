package me.cageydinosaur.listeners.join;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.cageydinosaur.listeners.Main;
import me.cageydinosaur.listeners.utils.Utils;

public class JoinListener implements Listener {
	
	private static Main plugin;
	
	public JoinListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if (!p.hasPlayedBefore()) {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("firstJoinMessage").replace("<player>", p.getName())));
		}
		else {
			Bukkit.broadcastMessage(Utils.chat(plugin.getConfig().getString("joinMessage").replace("<player>", p.getName())));
		}
	}
}
	