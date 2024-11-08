package Tasksheet121;

import static java.lang.Math.*;
import java.util.Scanner;

public class Tasksheet121 {
    

        public static int add(int a, int b) {
            return addExact(a, b);
        }
    
        public static int subtract(int a, int b) {
            return subtractExact(a, b);
        }
    
        public static int multiply(int a, int b) {
            return multiplyExact(a, b);
        }
    
        public static int divide(int a, int b) {
            return floorDiv(a, b); 
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
    
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
    
            int sum = add(a, b);
            int difference = subtract(a, b);
            int product = multiply(a, b);
            int quotient = divide(a, b);
    
            System.out.println("Addition of " + a + " and " + b + " is: " + sum);
            System.out.println("Subtraction of " + a + " and " + b + " is: " + difference);
            System.out.println("Multiplication of " + a + " and " + b + " is: " + product);
            System.out.println("Division of " + a + " by " + b + " is: " + quotient);
    
            scanner.close();
        }
}
