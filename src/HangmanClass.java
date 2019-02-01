import java.util.Scanner;

public class HangmanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] towns = {"Vratsa", "Botevgrad", "Sofia", "Sliven", "Stara Zagora", "Smolyan", "Borovets", "Dimitrovgrad"};
        String chosenTown = towns [(int) (Math.random() * towns.length)];
        chosenTown = chosenTown.toUpperCase();
        String replacingTheChosenTownWithDashes = chosenTown.replaceAll("[A-Z]", "_");

        System.out.println("\n");
        System.out.println("\n");

        System.out.println("Lets play Hangman. You have to guess a city/village situated in Bulgaria. Good luck ♥");

        int attempts = 0;
        int incorrectAttempts = 0;
    }

    }


