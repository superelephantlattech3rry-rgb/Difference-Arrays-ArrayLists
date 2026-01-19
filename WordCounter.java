import java.util.Scanner;

public class WordCounter {

    // Finds the position of the next blank character in a String
    // If none exists, the length of the string is returned.
    public static int nextSpacePosition(String str, int from) {
        for (int i = from; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                return i;
            }
        }
        return str.length();
    }

    // Finds the position of the next non-blank character in a String
    // If none exists, the length of the string is returned.
    public static int nextNonSpacePosition(String str, int from) {
        for (int i = from; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                return i;
            }
        }
        return str.length();
    }

    // Counts the number of words in a given string
    public static int countWords(String str) {
        int count = 0;
        int index = 0;

        while (index < str.length()) {
            index = nextNonSpacePosition(str, index);

            if (index < str.length()) {
                count++;
            }

            index = nextSpacePosition(str, index);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        int wordCount = countWords(sentence);

        System.out.println("Word count: " + wordCount);
    }
}
