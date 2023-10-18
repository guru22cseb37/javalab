import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class counter{
    public static void main(String[] args) {
        // Initialize a HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try {
            // Replace "your_input.txt" with the path to your text document
            File file = new File("your_input.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().toLowerCase(); // Convert to lowercase
                String[] words = line.split("[\\s,.!?;:]+"); // Split into words, ignoring punctuation and spaces

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
                    if (!word.isEmpty()) {
                        wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.exit(1);
        }

        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}