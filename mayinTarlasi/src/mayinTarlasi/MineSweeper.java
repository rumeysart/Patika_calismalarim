package mayinTarlasi;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MineSweeper {

    private final Scanner sc = new Scanner(System.in);
    private final Random rm = new Random();
    private int row;
    private int col;
    private String[][] mineField;
    private String[][] revealed;

    private int mineCount;

    public void start() {

        System.out.println("Welcome to the Mine Sweeper Game!!");

        System.out.print("Row Number: ");
        row = sc.nextInt();
        System.out.print("Column Number: ");
        col = sc.nextInt();

        mineCount = (row * col) / 4;

        mineField = new String[row][col];
        revealed = new String[row][col];

        for (int i = 0; i < mineField.length; i++) {
            for (int j = 0; j < mineField[i].length; j++) {

                mineField[i][j] = "-";
                revealed[i][j] = "-";
            }

        }

        while (mineCount > 0) {

            int i = rm.nextInt(row);
            int j = rm.nextInt(col);

            if (mineField[i][j].equals("-")) {

                mineField[i][j] = "*";
                mineCount--;

            }

        }
        printRevealed();

        play();

    }

    private void play() {
        boolean finish = false;
        while (!finish) {

            System.out.print("Row Number: ");
            int bRow = sc.nextInt();
            System.out.print("Column Number: ");
            int bCol = sc.nextInt();

            int number = 0;

            if (bRow < row && bCol < col) {

                if (mineField[bRow][bCol].equals("-") && revealed[bRow][bCol].equals("-")) {

                    for (int i = bRow - 1; i < bRow + 2; i++) {
                        for (int j = bCol - 1; j < bCol + 2; j++) {

                            if (i >= 0 && j >= 0 && i < row && j < col && mineField[i][j].equals("*")) {
                                number++;
                                revealed[bRow][bCol] = Integer.toString(number);
                            } else {
                                revealed[bRow][bCol] = Integer.toString(number);
                            }

                        }

                    }
                     printRevealed();

                    if (!checkWin()) {

                        System.out.println("Congrats! You Win!!!");
                        printMine();
                        finish = true;

                    }

                   

                } else if (mineField[bRow][bCol].equals("*")) {

                    System.out.println("Game Over :((");
                    printMine();
                    finish = true;

                } else if (!revealed[bRow][bCol].equals("-")) {

                    System.out.println("You already select this numbers. Please select another numbers.");

                }

            } else {
                System.out.println("Please select number from area of the mine sweeper ");
            }

        }

    }

    private void printRevealed() {
        System.out.println("---------------------------------");

        for (int i = 0; i < revealed.length; i++) {
            for (int j = 0; j < revealed[i].length; j++) {

                System.out.print(revealed[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    private void printMine() {
        System.out.println("---------------------------------");
        for (int i = 0; i < mineField.length; i++) {
            for (int j = 0; j < mineField[i].length; j++) {
                System.out.print(mineField[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("---------------------------------");
    }

    private boolean checkWin() {
        int count = 0;
        int mineNumber = 0;
        for (int i = 0; i < revealed.length; i++) {
            for (int j = 0; j < revealed[i].length; j++) {

                if (revealed[i][j].equals("-")) {

                    count++;

                }
                if (mineField[i][j].equals("*")) {

                    mineNumber++;

                }

            }

        }

        if (mineNumber == count) {

            return false;

        }

        return true;
    }

}