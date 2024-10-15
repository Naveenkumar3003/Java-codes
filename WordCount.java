import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine().trim();
        if (sentence.isEmpty()) {
            System.out.println("The sentence contains 0 words.");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("The sentence contains " + words.length + " words.");
        }    
        scanner.close();
    }
}

