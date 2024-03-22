package adventureGame;

public class Inventory {
	private boolean water;
    private int waterCount;
    private boolean food;
    private int foodCount;
    private boolean fireWood;
    private int fireWoodCount;
	private Weapon weapon;
	private Armor armor;

	public Inventory()
	{
		this.water = false;
        this.food = false;
        this.fireWood = false;
        this.waterCount = 0;
        this.foodCount = 0;
        this.fireWoodCount = 0;
		this.weapon = new Weapon("Punch", -1, 0, 0);
		this.armor = new Armor(-1, "Schmatte", 0, 0);
	}
	
	public boolean isWater() {
		return water;
	}

	public int getWaterCount() {
		return waterCount;
	}

	public boolean isFood() {
		return food;
	}

	public int getFoodCount() {
		return foodCount;
	}

	public boolean isFireWood() {
		return fireWood;
	}

	public int getFireWoodCount() {
		return fireWoodCount;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public void setWaterCount(int waterCount) {
		this.waterCount = waterCount;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
	}

	public void setFireWood(boolean fireWood) {
		this.fireWood = fireWood;
	}



	public void setFireWoodCount(int fireWoodCount) {
		this.fireWoodCount = fireWoodCount;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
