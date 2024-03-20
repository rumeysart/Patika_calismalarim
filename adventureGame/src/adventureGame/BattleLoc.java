package adventureGame;

import java.util.Random;

public class BattleLoc extends Location{

	private Monster monster;
	private String award;
	private int maxMonster;
	
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
				System.out.println("You defeated all monsters in the" + this.getName() + "!");
				return true;
		}
		if (this.getPlayer().getHealth() <= 0)
		{
			System.out.println("You are dead!");
			return false;
		}
		return true;
	}
	
	public boolean combat(int monsNum)
	{
		for(int i = 1; i <= monsNum; i++)
		{
			this.getMonster().setHealth(this.getMonster().getOrjHealth());
			playerStats();
			monStats(i);
			while(this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0)
			{
				System.out.println("<S>hoot or <R>un");
				String selectCombat = input.nextLine();
				selectCombat = selectCombat.toUpperCase();
				if (selectCombat.equals("S"))
				{
					System.out.println("You shoot!");
					this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
					afterHit();
					if (this.getMonster().getHealth()> 0 )
					{
						System.out.println();
						System.out.println(this.getMonster().getName() + " hit you!");
						int monsDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
						if (monsDamage < 0)
							monsDamage = 0;
						this.getPlayer().setHealth(this.getPlayer().getHealth() - monsDamage);
						afterHit();
					}
				}
				else
				{
					return false;
				}
			}
			if (this.getMonster().getHealth() < this.getPlayer().getHealth())
			{
				System.out.println("You defeated monsters");
				System.out.println("You've earned " + this.getMonster().getAward() + " money");
				this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAward());
				System.out.println("Current money: " + this.getPlayer().getMoney());
			}
			else
			{
				return false;
			}
		}
		return true;
	}

	public void afterHit()
	{
		System.out.println("Your health: " + this.getPlayer().getHealth());
		System.out.println(this.getMonster().getName() + "'s Health: " + this.getMonster().getHealth());
		System.out.println("----------------------");
	}
	
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
	
	public void monStats(int i)
	{
		System.out.println(i + ". " + this.getMonster().getName() + " Values");
		System.out.println("--------------------");
		System.out.println("Health: " + this.getMonster().getHealth());
		System.out.println("Damage: " + this.getMonster().getDamage());
		System.out.println("Award: " + this.getMonster().getAward());
		System.out.println();
	}
	
	public int randomMonsterNum()
	{
		Random r = new Random();
		return r.nextInt(this.getMaxMonster()) + 1;
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
