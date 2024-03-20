package adventureGame;

public class Cave extends BattleLoc{

	public Cave(Player player) {
		super(player, "cave", new Zombie(), "food", 4);
	}
	
}
