package adventureGame;

public class Monster {
	private int id;
	private int damage;
	private int health;
	private String name;
	private int award;
	private int orjHealth;

	public Monster(int id, int damage, int health, String name, int award) {
		super();
		this.id = id;
		this.damage = damage;
		this.orjHealth = health;
		this.name = name;
		this.award = award;
	}
	

	public int getOrjHealth() {
		return orjHealth;
	}


	public void setOrjHealth(int orjHealth) {
		this.orjHealth = orjHealth;
	}


	public int getId() {
		return id;
	}

	public int getDamage() {
		return damage;
	}

	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAward() {
		return award;
	}

	public void setAward(int award) {
		this.award = award;
	}
	
}
