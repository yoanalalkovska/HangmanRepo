import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Random;

public class HangmanContinue {
    String mysteryWord;
    StringBuilder currentGuess;
    ArrayList<Character> previousGuesses = new ArrayList<>();
    int maxTries = 6;
    int currentTry = 0;

    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedFileReader;

    public HangmanContinue () throws IOException{
        initializesStreams ();
        mysteryWord = pickWord ();
        currentGuess = initializeCurrentGuess();

    }
    public void initializesStreams() throws IOException {
        try {
            File inFile = new File("dictionary.txt");
            fileReader = new FileReader(inFile);
            bufferedFileReader = new BufferedReader(fileReader);
            String currentLine = bufferedFileReader.readLine();
            while (currentLine!=null){
                dictionary.add (currentLine);

            }
            bufferedFileReader.close();
            fileReader.close();
        }
        catch (IOException e){
            System.out.println("Couldn't init streams");
        }
    }
    public String pickWord(){
        Random rand = new Random();
        int wordIndex = Math.abs (rand.nextInt())%dictionary.size();
        return dictionary.get(wordIndex);
    }
}
