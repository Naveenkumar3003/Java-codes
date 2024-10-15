CODE:
import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        System.out.println("All permutations:");
        
        String[] prefixes = new String[str.length() * str.length()];
        String[] remainings = new String[str.length() * str.length()];
        int index = 0;
        
        prefixes[index] = "";
        remainings[index] = str;
        index++;
        
        while (index > 0) {
            index--;
            String currentPrefix = prefixes[index];
            String currentRemaining = remainings[index];
            int remainingLength = currentRemaining.length();
            if (remainingLength == 0) {
                System.out.println(currentPrefix);
            } else {
                for (int i = 0; i < remainingLength; i++) {
                    prefixes[index] = currentPrefix + currentRemaining.charAt(i);
                    remainings[index] = currentRemaining.substring(0, i) + currentRemaining.substring(i + 1);
                    index++;
                }
            }
        }
        
        scanner.close();
    }
}

