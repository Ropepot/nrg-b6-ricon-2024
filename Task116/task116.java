package Task116;

import java.util.Scanner;

public class task116 {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        // Use StringBuilder to reverse the string
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        
        // Check if the original string and the reversed string are equal
        if (input.equals(reversedString.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

