package adventureGame;

import java.util.Scanner;

public class Player {
	private int damage;
	private int health;
	private int money;
	private int orjHealth;
	private String name;
	private String chrName;
	private Scanner input = new Scanner(System.in);
	private Inventory inventory;
	
	public Player(String name) {
		this.name = name;
		this.inventory = new Inventory();
	}
	


	public void selectChr()
	{		
		GameChar[] charList= {new Samurai(), new Archer(), new Knight()}; 
		System.out.println("Characters");
		System.out.println("----------------------------------------------------------");
		for(GameChar gameChar : charList)
		{
			System.out.println("ID: " + gameChar.getId() + "\t Character: " + gameChar.getName() + "\t\t Damage: " 
							+ gameChar.getDamage() + "\t\t Health: " + gameChar.getHealth() 
							+ "\t\t Money: " + gameChar.getMoney());
		}	
		System.out.println("---------------------------------------------------------------");
		System.out.print("Please select a character: ");
		int selectChar = input.nextInt();
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		switch (selectChar) {
		case 1:
			initPlayer(new Samurai());
			break;
		case 2:
			initPlayer(new Archer());
			break;
		case 3:
			initPlayer(new Knight());
			break;
		default:
			initPlayer(new Samurai());
		}
		/*System.out.println("Character: " + this.getChrName() 
		+ ", Damage: " + this.getDamage()+
		", Health: " + this.getHealth() + ", Money: " +
		this.getMoney());*/
	}

	public void initPlayer(GameChar gameChar)

	{
		this.setDamage(gameChar.getDamage());
		this.setHealth(gameChar.getHealth());
		this.setOrjHealth(gameChar.getHealth());
		this.setMoney(gameChar.getMoney());
		this.setChrName(gameChar.getName());
	}
	
	public void printInfo()
	{
		System.out.println("Character: " + this.getChrName() 
		+", Weapon: " + this.getInventory().getWeapon().getName() 
		+ ", Block: " + this.getInventory().getArmor().getBlock()
		+", Damage: " + this.getTotalDamage()
		+", Armor: " + this.getInventory().getArmor().getName() 
		+", Health: " + this.getHealth() + ", Money: " + this.getMoney());
	}
	
	public int getTotalDamage()
	{
		return damage + this.getInventory().getWeapon().getDamage();
	}
	
	public int getDamage() {//encapsulation için kulanıyorum
		return damage;
	}
	
	public Weapon getWeapon()
	{
		return this.getInventory().getWeapon();
	}

	public int getHealth() {
		return health;
	}

	public int getMoney() {
		return money;
	}

	public String getName() {
		return name;
	}

	public String getChrName() {
		return chrName;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void setHealth(int health) {
		if (health < 0)
		{
			health = 0;
		}
		this.health = health;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setChrName(String chrName) {
		this.chrName = chrName;
	}
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}



	public int getOrjHealth() {
		return orjHealth;
	}



	public void setOrjHealth(int orjHealth) {
		this.orjHealth = orjHealth;
	}
}

