import java.util.Scanner;

public class SentenceAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("No character was entered.");
            scanner.close();
            return;
        }

        char chosenCharacter = input.charAt(0);
        int occurrences = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == chosenCharacter) {
                occurrences++;
            }
        }

        System.out.println("\nOriginal sentence: " + sentence);
        System.out.println("Length: " + sentence.length());
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        if (!sentence.isEmpty()) {
            System.out.println("First character: " + sentence.charAt(0));
            System.out.println(
                "Last character: " + sentence.charAt(sentence.length() - 1)
            );
        }

        System.out.println(
            "Occurrences of '" + chosenCharacter + "': " + occurrences
        );

        System.out.println("Contains Java: " + sentence.contains("Java"));

        scanner.close();
    }
}
