package adventureGame;

public class SafeHouse extends NormalLoc{

	public SafeHouse(Player player) {
		super(player, "Safe House");
	}
	@Override
	public boolean onLocation()
	{
		System.out.println("+++++++++++++ You are in the safe house! +++++++++++++");
		System.out.println();
		System.out.println("+++++++++++++++ Your health is renewed! ++++++++++++++++");
		System.out.println();
		this.getPlayer().setHealth(this.getPlayer().getOrjHealth());
		 // Tüm ödüller toplandı mı kontrolü
        if(getPlayer().getInventory().getFoodCount() == 1 && getPlayer().getInventory().getWaterCount() == 1 && getPlayer().getInventory().getFireWoodCount()==1)
        {
            System.out.println("You win the game!");
        }
        else
        {
            System.out.println("Collect the rewards from all regions to win the game and return to the safe house.");
        }
		return true;
	}
}
