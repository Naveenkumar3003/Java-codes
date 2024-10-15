import java.util.Scanner;
 class MITSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        if (input.contains("MIT")) {
            System.out.println("The string contains 'MIT'");
        } else {
            System.out.println("The string does not contain 'MIT'");
        }
        scanner.close();
    }
}

