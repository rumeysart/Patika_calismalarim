package adventureGame;

public abstract class NormalLoc extends Location{
	public NormalLoc(Player player, String name) {
		super(player, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation()
	{
		return true;
	}

}
