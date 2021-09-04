package me.cageydinosaur.listeners;

import org.bukkit.plugin.java.JavaPlugin;

import me.cageydinosaur.listeners.join.JoinListener;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new JoinListener(this);
	}
	
}
