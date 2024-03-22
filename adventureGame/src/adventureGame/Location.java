package adventureGame;

import java.util.Scanner;

//Location sınıfı, oyun içindeki farklı konumları temsil eden abstract bir sınıftır.
//Bu sınıf, genel olarak bir konumun adını ve o konumda gerçekleşecek olayları içerir
public abstract class Location {
	private Player player; // Konumda bulunan oyuncuyu temsil eden değişken
	private String name; // Konumun adını temsil eden değişken
	protected static Scanner input = new Scanner(System.in);

	public Location(Player player, String name) {
		super();
		this.player = player;
		this.name = name;
	}

    //Konumda gerçekleşecek olayları işleyen metot.
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
