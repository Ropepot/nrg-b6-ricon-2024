package Chapter2;

public class Operators {
    public static void main(String[] args){
        int p = 0;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(--p);
        System.out.println(p);
        System.out.println((10 + p * --p) + p++);

    }
    
}
class Addition {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = x + y;
        System.out.println("The sum is " + z );
    }
    
}