package adventureGame;

import java.util.Random;
public class Snake extends Monster {
private static Random random = new Random();
    public Snake() {
        super(4, random.nextInt(3,7), 12, "Snake", 0);
    }
}
