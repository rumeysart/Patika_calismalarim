package adventureGame;

import java.util.Random;

public class BattleLoc extends Location{

	private Monster monster;
	private String award;
	private int maxMonster;
	public Random random = new Random();
	
	public BattleLoc(Player player, String name, Monster monster, String award, int maxMonster) {
		super(player, name);
		this.monster = monster;
		this.award = award;
		this.maxMonster = maxMonster;
	}
	
	@Override
	public boolean onLocation()
	{
		int monsNum = this.randomMonsterNum(); 
		System.out.println("You are in the " + this.getName() + " now.");
		System.out.println("Be careful! " + monsNum  + " "+ this.getMonster().getName() + "s are living here.");
		System.out.println("<F>ight or <R>un away!");
		String selectCase = input.nextLine();
		selectCase = selectCase.toUpperCase();
		if(selectCase.equals("F") && combat(monsNum))
		{
				System.out.println();
				System.out.println("You defeated all monsters in the " + this.getName() + "!");
				return true;
		}
		if (this.getPlayer().getHealth() <= 0)
		{
			System.out.println("You are dead!");
			return false;
		}
		return true;
	}
	
	//oyuncunun canavarlarla savaştığı fonksiyon
	public boolean combat(int monsNum)
	{
		for(int i = 1; i <= monsNum; i++)
		{
			this.getMonster().setHealth(this.getMonster().getOrjHealth());
			playerStats();
			monStats(i);
			boolean playerFirst = Math.random() > 0.5;
			
			while(this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0)
			{
				System.out.println("<S>hoot or <R>un");
				String selectCombat = input.nextLine().toUpperCase();
				if (playerFirst)
				{
					if (selectCombat.equals("S"))
					{
						System.out.println(this.getPlayer().getName() + " shoot.");
						this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
						afterHit();
					}
					else
					{
						return false;
					}
				}
				else 
				{
					if (this.getMonster().getHealth()> 0 )
					{
						System.out.println();
						System.out.println(this.getMonster().getName() + " shoot you!");
						int monsDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
						if (monsDamage < 0)
							monsDamage = 0;
						this.getPlayer().setHealth(this.getPlayer().getHealth() - monsDamage);
						afterHit();
						if (this.getPlayer().getHealth() <= 0)
						{
							System.out.println("You are dead :(");
							return false;
						}
					}
				}
			}
			if (this.getMonster().getHealth() < this.getPlayer().getHealth())
			{
				int count = 0;
				System.out.println("You killed monsters.");
				System.out.println("You've earned " + this.getMonster().getAward() + " coins.");
				this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAward());
				System.out.println("Current money : " + this.getPlayer().getMoney());
				if (i == monsNum && this.getMonster().getName().equals("Zombie")) {
					this.getPlayer().getInventory().setFood(true);
					count++;
					System.out.println("Congrats! You win food.");
					this.getPlayer().getInventory().setFoodCount(count);
				} 
				else if (i == monsNum && this.getMonster().getName().equals("Vampire")) 
				{
					this.getPlayer().getInventory().setFireWood(true);
					count++;
					System.out.println("Congrats! You win wood.");
					this.getPlayer().getInventory().setFireWoodCount(count);
				} 
				else if (i == monsNum && this.getMonster().getName().equals("Bear")) 
				{
					this.getPlayer().getInventory().setWater(true);
					count++;
					System.out.println("Congrats! You win water.");
					this.getPlayer().getInventory().setWaterCount(count);
				}
				else if (i == monsNum && this.getMonster().getName().equals("Snake")) 
				{
            		getSnake();
				}
			}
		}
		return true;
	}
	
	//Her vuruş sonrasında ekrana canavar ve oyuncunun güncel sağlık durumlarını yazdıran fonksiyon
	public void afterHit()
	{
		System.out.println("Your health: " + this.getPlayer().getHealth());
		System.out.println(this.getMonster().getName() + "'s Health: " + this.getMonster().getHealth());
		System.out.println("----------------------");
	}
	
	//Oyuncunun genel istatistiklerini ekrana yazdıran metot
	public void playerStats()
	{
		System.out.println("Player Values");
		System.out.println("----------------------");
		System.out.println("Health: " + this.getPlayer().getHealth());
		System.out.println("Damage: " + this.getPlayer().getTotalDamage());
		System.out.println("Money: " + this.getPlayer().getMoney());
		System.out.println("Weapon: " + this.getPlayer().getWeapon().getName());
		System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
		System.out.println("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
		System.out.println();
	}
	
	//Canavarın genel özelliklerini ekrana yazdıran metot
	public void monStats(int i)
	{
		System.out.println(i + ". " + this.getMonster().getName() + " Values");
		System.out.println("--------------------");
		System.out.println("Health: " + this.getMonster().getHealth());
		System.out.println("Damage: " + this.getMonster().getDamage());
		System.out.println("Award: " + this.getMonster().getAward());
		System.out.println();
	}
	
	//Bölgede çıkacak olan canavarların random değerlerini atama
	public int randomMonsterNum()
	{
		Random r = new Random();
		return r.nextInt(this.getMaxMonster()) + 1;
	}
	
    public void getSnake() {
        int randomNumber = random.nextInt(100);
        if (randomNumber <= 15) {
            //Silah kazanma durumu
            weaponRate();
        } else if (randomNumber <= 30) {
            //Zırh kazanma durumu
            armorRate();
        } else if (randomNumber <= 55) {
            //Para kazanma durumu
            moneyRate();
        } else {
            System.out.println("You've won nothing.");
        }
    }
    
    public void weaponRate() {
        int randomNum = random.nextInt(1, 101);
        if (randomNum <= 50) {
            System.out.println("You win a sword.");
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(1));
        } else if (randomNum <= 80) {
            System.out.println("You win a revolver.");
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(2));
        } else if (randomNum <= 100) {
            System.out.println("You win a rifle.");
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(3));
        }
    }

    public void armorRate() {
        int randomNum = random.nextInt(1, 101);
        if (randomNum <= 50) {
            System.out.println("You win weak armor.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(1));
        } else if (randomNum <= 80) {
            System.out.println("You win medium armor.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(2));
        } else if (randomNum <= 100) {
            System.out.println("You win heavy armor.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjByID(3));
        }
    }

    public void moneyRate() {
        int randomNum = random.nextInt(1, 101);
        int money = 0;
        if (randomNum <= 50) {
            money = 1;
            System.out.println("You've earned 1 coin.");
            this.getPlayer().setMoney(getPlayer().getMoney() + money);

        } else if (randomNum <= 80) {
            money = 5;
            System.out.println("You've earned 5 coins.");
            this.getPlayer().setMoney(getPlayer().getMoney() + money);
        } else if (randomNum <= 100) {
            money = 10;
            System.out.println("You've earned 10 coins.");
            this.getPlayer().setMoney(getPlayer().getMoney() + money);
        }
    }

	
	
	public int getMaxMonster() {
		return maxMonster;
	}

	public void setMaxMonster(int maxMonster) {
		this.maxMonster = maxMonster;
	}

	public Monster getMonster() {
		return monster;
	}

	public String getAward() {
		return award;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public void setAward(String award) {
		this.award = award;
	}

}
