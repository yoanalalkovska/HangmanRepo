
import java.util.Scanner;

public class HangmanClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean doYowantToPlay = true;
        while (doYowantToPlay) {

            while (!game.gameOver()){

            }
            System.out.println();
            System.out.println("Искате ли още една игра? Натиснете Y");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYowantToPlay = (response == 'Y');


        }
    }
}
