
import java.util.Scanner;

public class HangmanClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman! The computer will think of a city/village " +
                "in Bulgaria in Bulgarian and you gotta guess it.");

        boolean doYowantToPlay = true;
        while (doYowantToPlay) {

            while (!game.gameOver()){

            }
            System.out.println();
            System.out.println("Wanna play again? Press Y");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYowantToPlay = (response == 'Y');


        }
    }
}
