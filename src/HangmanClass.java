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
        String guess; //stores the guessed letter we have input
        char letter; // pulls out the first letter from guess for use
        boolean alreadyGuessedLetters;
        String allGuessedLetters = "";
        boolean correctGuess; //boolean for guess in chosenTown

        while (incorrectAttempts<9&&replacingTheChosenTownWithDashes.contains("_")){
            System.out.println(replacingTheChosenTownWithDashes);
            System.out.print("\n");
            System.out.println("You have " + incorrectAttempts + " incorrect guesses so far.");
            System.out.print("\n");
//                    " - - - - -\n"+
//                    "|        |\n"+
//                    "|        O\n" +
//                    "|      / | \\ \n"+
//                    "|        |\n" +
//                    "|       / \\ \n" +
//                    "|\n" +
//                    "|\n");


             if (incorrectAttempts==1){
                System.out.println(" - - - - -\n"+
                                   "|        |\n"+
                                   "|        \n" +
                                   "|      \n"+
                                   "|        \n" +
                                   "|        \n" +
                                   "|\n" +
                                   "|\n");
                System.out.print("\n");
            }
            else if (incorrectAttempts==2){
                System.out.println(" - - - - -\n"+
                        "|        |\n"+
                        "|        O\n" +
                        "|      \n"+
                        "|        \n" +
                        "|        \n" +
                        "|\n" +
                        "|\n");
                System.out.print("\n");

            }
            else if (incorrectAttempts==3){
                System.out.println(" - - - - -\n"+
                        "|        |\n"+
                        "|        O\n" +
                        "|        |\n"+
                        "|        \n" +
                        "|        \n" +
                        "|\n" +
                        "|\n");
                System.out.print("\n");

            }
            else if (incorrectAttempts==4){
                System.out.println(" - - - - -\n"+
                        "|        |\n"+
                        "|        O\n" +
                        "|        |\\\n"+
                        "|        \n" +
                        "|        \n" +
                        "|\n" +
                        "|\n");
                System.out.print("\n");

            }
            else if (incorrectAttempts==5){
                System.out.println(" - - - - -\n"+
                        "|        |\n"+
                        "|        O\n" +
                        "|       /|\\\n"+
                        "|        \n" +
                        "|        \n" +
                        "|\n" +
                        "|\n");
                System.out.print("\n");

            }
            else if (incorrectAttempts==6){
                System.out.println(" - - - - -\n"+
                        "|        |\n"+
                        "|        O\n" +
                        "|       /|\\\n"+
                        "|        |\n" +
                        "|        \n" +
                        "|\n" +
                        "|\n");
                System.out.print("\n");

            }
            else if (incorrectAttempts==7){
                System.out.println(" - - - - -\n"+
                        "|        |\n"+
                        "|        O\n" +
                        "|       /|\\\n"+
                        "|        |\n" +
                        "|       /\n" +
                        "|\n" +
                        "|\n");
                System.out.print("\n");

            }
            else if (incorrectAttempts==8){
                System.out.println(" - - - - -\n"+
                        "|        |\n"+
                        "|        O\n" +
                        "|       /|\\ \n"+
                        "|        |\n" +
                        "|       / \\\n" +
                        "|\n" +
                        "|\n");
                System.out.print("\n");

            }
            System.out.println("Guess a letter: ");
            guess = input.nextLine();
            guess = guess.toUpperCase();
            letter = guess.charAt(0);
            alreadyGuessedLetters = (allGuessedLetters.indexOf(letter)) != -1;
            allGuessedLetters += letter; // stores every letter guessed in guesses

            letter = Character.toUpperCase(letter); // converts to uppercase for comparison
            System.out.print("\n");
        }
    }

    }


