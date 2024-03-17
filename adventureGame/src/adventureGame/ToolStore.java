package adventureGame;

public class ToolStore extends NormalLoc{

	public ToolStore(Player player) {
		super(player, "Store");
	}
	@Override
	public boolean onLocation()
	{
		System.out.println("------------- Welcome to the tool store! -------------");
		boolean showMenu = true;
		while(showMenu)
		{
			System.out.println("1- Weapons");
			System.out.println("2- Armors");
			System.out.println("3- Exit");
			System.out.println("Your choose: ");
			int selectCase = input.nextInt();
			while(selectCase < 1 || selectCase > 3)
			{
				System.out.println("You have entered an invalid value, please enter it again: ");
				selectCase = input.nextInt();
			}
			switch(selectCase)
			{
			case 1:
				printWeapon();
				buyWeapon();
				break;
			case 2:
				printArmor();
				buyArmor();
				break;
			case 3:
				System.out.println("Wait for you again!");
				showMenu = false;
				break;				
			}
		}
		return true;
	}
	
	public void printWeapon() {
		System.out.println("---- Weapons ----");
		System.out.println();
		for(Weapon w : Weapon.weapons()) {
			System.out.println(w.getId() + "-" +   w.getName() + " ->  Price: " + w.getPrice() + ", Damage: " + w.getDamage());
		}
		System.out.println("0- Exit");
	}
	
	public void buyWeapon()
	{
		System.out.println("Please select a weapon: ");
		int selectWeaponID = input.nextInt();
		while(selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length)
		{
			System.out.println("Entered an invalid value, please enter it again: ");
			selectWeaponID = input.nextInt();
		}
		if (selectWeaponID != 0)
		{
			Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
			
			if(selectedWeapon != null)
			{
				if(selectedWeapon.getPrice() > this.getPlayer().getMoney())
				{
					System.out.println("Sorry! Don't have enough money for this weapon.");
				}
				else
				{
					//satın alma işleminin gerçekleştiği alan
					System.out.println(selectedWeapon.getName() + " weapon bought.");
					int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Reamining money: " + this.getPlayer().getMoney());
					System.out.println("Previous weapon: "+ this.getPlayer().getInventory().getWeapon().getName());
					this.getPlayer().getInventory().setWeapon(selectedWeapon);
					System.out.println("New weapon: " + this.getPlayer().getInventory().getWeapon().getName());
				}
			}
		}
	}
	
	public void printArmor() {
		System.out.println("++++++ ARMORS ++++++");
		System.out.println();
		for(Armor a : Armor.armors())
		{
			System.out.println(a.getId() + " - " + a.getName() +
					" <Money: " + a.getPrice() + ", Armor: " + a.getBlock() + " >");
		}
		System.out.println("0- Exit");
	}
	public void buyArmor()
	{
		System.out.println("Please select an armor: ");

		int selectArmorID = input.nextInt();
		while(selectArmorID < 0 || selectArmorID > Armor.armors().length)
		{
			System.out.println("Entered an invalid value, please enter it again: ");
			selectArmorID = input.nextInt();
		}
		if(selectArmorID != 0)
		{
			Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
			
			if (selectedArmor != null)
			{
				if(selectedArmor.getPrice() > this.getPlayer().getMoney())
				{
					System.out.println("Sorry! Don't have enough money for this armor.");
				}
				else
				{
					System.out.println(selectedArmor.getName() + ", armor bought.");
					int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Reamining money: " + this.getPlayer().getMoney());
					this.getPlayer().getInventory().setArmor(selectedArmor);
				}
			}
		}
		
	}
}
