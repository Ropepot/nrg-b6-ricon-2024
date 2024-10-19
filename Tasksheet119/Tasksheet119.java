package Tasksheet119;

import java.util.Scanner;

public class Tasksheet119 {

    
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

  
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

   
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is undefined.");
            return 0;
        }
    }

    
    public static void printResult(String operation, double result) {
        if (result == (int) result) {  
            System.out.println(operation + " result: " + (int) result);  
        } else {
            System.out.println(operation + " result: " + result);  
        }
    }

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Choose an operation to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double result = 0;
        String operation = "";
        boolean validChoice = true;

        
        switch (choice) {
            case 1:
                result = add(number1, number2);
                operation = "Addition";
                break;
            case 2:
                result = subtract(number1, number2);
                operation = "Subtraction";
                break;
            case 3:
                result = multiply(number1, number2);
                operation = "Multiplication";
                break;
            case 4:
                result = divide(number1, number2);
                operation = "Division";
                break;
            default:
                validChoice = false;
                System.out.println("Invalid choice! Please select a number between 1 and 4.");
        }

    
        if (validChoice) {
            printResult(operation, result);
        }

      
        scanner.close();
    }
}
