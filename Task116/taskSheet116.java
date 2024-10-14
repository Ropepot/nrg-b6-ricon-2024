package Task116;

import java.util.Scanner;

public class taskSheet116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        
        if (input.equals(reversedString.toString())) {
            System.out.println("The input string [" + reversedString +  "] is a palindrome.");
        } else {
            System.out.println("The input string [" + reversedString +  "] is not a palindrome.");
        }
        
        scanner.close();
    }
}

