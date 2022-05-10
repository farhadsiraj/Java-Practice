import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers from 1 through 6.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers cannot be less than one.");
            System.exit(0);
        }
        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers cannot be greater than six.");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;
        System.out.println("Player Sum: " + sumOfNumbers);
        System.out.println("Dice Sum: " + sumDiceRolls);

        if (checkWin(sumDiceRolls, sumOfNumbers)) {
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("Sorry, you lose.");
            ;
        }

        scan.close();
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        return (int) randomNumber + 1;
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers) {
        return (sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3);
    }
}
