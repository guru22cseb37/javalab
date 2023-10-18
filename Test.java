import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter three words to generate a three-letter acronym:");
           
            String userInput = input.nextLine();
            String[] words = userInput.split(" "); // Split the input into words
           
            // Initialize an empty acronym
            StringBuilder acronym = new StringBuilder();
           
            // Build the acronym from the first letter of each word (up to three words)
            for (int i = 0; i < Math.min(3, words.length); i++) {
                if (!words[i].isEmpty()) { // Ignore empty words
                    acronym.append(words[i].charAt(0));
                }
            }
           
            String acronymResult = acronym.toString().toUpperCase(); // Convert to uppercase
           
            System.out.println("Three-Letter Acronym: " + acronymResult);
        }
    }
}