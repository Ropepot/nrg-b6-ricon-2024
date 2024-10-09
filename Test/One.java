package Test;


public class One {
    public static void main(String[] args) {
        int x = 4;
        long y = x * 4 - x++;
        if (y < 10) 
            System.out.println("Too Low");
        else 
            System.out.println("Just right");
    }
}

class TernaryTester {
     public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 2 ? x < 4 ? 10 : 7 : 8);
    }
}

class bool{
    public static void main(String[] args) {
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z=false);
        System.out.println(x+", "+y+", "+z);
    }
}
class Hello {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }
}

 class wooska {
    public static void main(String[] args) {
        byte a = 40, b = 50;
        byte sum = (byte) (a + b); 
        System.out.println(sum);
    }
}

 class ArithmeticSample {
     public static void main(String[] args) {
     int x = 5 * 4 % 3;
     System.out.println(x);
    }
}

class Success {
    public static void main(String[] args) {
        int x = 0;
        int y = 0; 
        if (x == y) 
            System.out.println("Success");
        else 
            System.out.println("Failure");
    }
}

class fail{
    public static void main(String[] args) {
        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        if(b = true) 
        System.out.println("Success");
        else 
        System.out.println("Failure");

    }
}

class code1{
    public static void main(String[] args) {
        int c = 7;
        int result = 4;
        result += ++c;
        System.out.println(result);
    }
}

class Codetwo {

    public static void main(String[] args) {
        int x = 1, y = 15;
        while (x < 10) {
            y--;
            x++;
        }
        System.out.println(x + ", " + y);
    }
}

class codeThree{
    public static void main(String[] args) {
            do {
             int y = 1;
             System.out.print(y++ + " ");
             } while(y <= 10);
    }
}

class codeFour{
    public static void main(String[] args) {
        int y = 1;  
        do {
            System.out.print(y++ + " ");
        } while (y <= 10);  
    }
}

class goingKeep{
   public static void main(String[] args) {
        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if(i==8) keepGoing = false;
        result -= 2;
        } while(keepGoing);
        System.out.println(result);
   }
}

class rowLoop{
    public static void main(String[] args) {
         int count = 0;
         ROW_LOOP: for(int row = 1; row <=3; row++)
        for(int col = 1; col <=2 ; col++) {
         if(row * col % 2 == 0) continue ROW_LOOP;
         count++;
        }
        System.out.println(count);
    }
}

class mPlus{
    public static void main(String[] args) {
         int m = 9, n = 1, x = 0;
            while(m > n) {
            m--;
            n += 2;
            x += m + n;
            }
            System.out.println(x);
    }
}

class charSwitch{
    public static void main(String[] args) {
            final char a = 'A', d = 'D';
            char grade = 'B';
            switch(grade) {
            case a:
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break;
            case d:
            case 'F': System.out.print("not good");
            }

    }
}