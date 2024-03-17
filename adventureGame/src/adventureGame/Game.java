package adventureGame;
import java.util.Scanner;

public class Game {
	private Scanner input = new Scanner(System.in);

	public void start() {
		System.out.println("Welcome to the adventure game!");
		System.out.print("Please enter a nickname: ");
		String playerName = input.nextLine();
		Player player = new Player(playerName);
		System.out.println("Sir " + player.getName() + ", welcome to this dark and foggy island!");
		System.out.println("What's happening here is real");
		player.selectChr();
		
		Location location = null;
		while (true)
		{
			player.printInfo();
			System.out.println("############### AREAS ###############");
			System.out.println("1- Safe House -> This place is safe place for you, there are no enemies!");
			System.out.println("2- Tool Store -> You can buy weapons and armors.");
			System.out.println("0- Exit -> End of the game");
			System.out.print("Please select the area which you want to visit: ");
			int selectLoc = input.nextInt();
			switch (selectLoc)
			{
			case 0:
				location = null;
				break;
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new ToolStore(player);
				break; 
			default:
				location = new SafeHouse(player);
			}
			
			if (location == null)
			{
				System.out.println("Leave from the game early :(");
				break;
			}
			if(!location.onLocation())
			{
				System.out.println("GAME OVER!");
				break;
			}			
		}
	}	
}
