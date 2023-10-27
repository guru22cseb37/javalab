import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class WordCount {
    public static void main(String[] args) {
        for (String filename : args) {
            Thread wordCountThread = new Thread(() -> {
                try {
                    int wordCount = countWords(filename);
                    System.out.println(filename + ": " + wordCount);
                } catch (IOException e) {
                    System.err.println("Error counting words in " + filename + ": " + e.getMessage());
                }
            });
            wordCountThread.start();
        }
    }
    public static int countWords(String filename) throws IOException {
        int wordCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words
                wordCount += words.length;
            }
        }
        return wordCount;
    }
}
