package boxGame;

public class Main {

	public static void main(String[] args) {

		Fighter f1 = new Fighter("A", 15, 100, 90,0);
		Fighter f2 = new Fighter("B", 10, 95, 100, 0);

		Ring ring = new Ring(f1, f2, 90, 100);
		ring.run();
	}

}
