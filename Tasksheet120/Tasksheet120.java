package Tasksheet120;

import java.util.Scanner;

public class Tasksheet120 {
       
        public static void cumulativeSum(int... numbers) {
            int totalSum = 0; 
            
           
            for (int number : numbers) {
                int currentSum = 0;
                
               
                for (int i = 1; i <= number; i++) {
                    currentSum += i;  
                }
                
                
                totalSum += currentSum;
                
               
                System.out.println("Cumulative sum for " + number + " is: " + currentSum);
            }
            
            
            System.out.println("Total sum of all cumulative sums: " + totalSum);
        }
    
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            
         
            System.out.println("Enter 3 numbers:");
    
          
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
    
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
    
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();
    
          
            cumulativeSum(num1, num2, num3);
    
            
        }
}
