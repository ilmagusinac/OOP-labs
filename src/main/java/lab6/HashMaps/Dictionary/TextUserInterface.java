package lab6.HashMaps.Dictionary;

import java.util.Scanner;
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface \n");

        while(true) {
            System.out.print("Statement: ");
            String statement = reader.nextLine();
            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")){
                System.out.print("In Finnish: ");
                String word = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                this.dictionary.add(word, translation);
                System.out.println();
            } else if (statement.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                String translation = this.dictionary.translate(word);
                System.out.print("Translation: ".concat(translation) + "\n");
                System.out.println();
            }
        }
    }
}
