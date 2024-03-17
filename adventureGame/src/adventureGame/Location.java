package adventureGame;

import java.util.Scanner;

public abstract class Location {
	private Player player;
	private String name;
	protected static Scanner input = new Scanner(System.in);

	public Location(Player player, String name) {
		super();
		this.player = player;
		this.name = name;
	}

	public abstract boolean onLocation();

	public Player getPlayer() {
		return player;
	}

	public String getName() {
		return name;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
