package Tasksheet129;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    
    
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Put gorilla food into cage.");
            // put gorilla food into cage
            return true;
        } else {
            System.out.println("Not time to eat yet.");
            return false;
        }
    }
    
    
    public void groom() {
        System.out.println("Lather, rinse, repeat.");
        // lather, rinse, repeat
    }
    
    
    public void pet() {
        System.out.println("Pet at your own risk.");
        // pet at your own risk
    }
}

public class Tasksheet129 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        System.out.println("Feeding time:");
        gorilla.feed(false);
        
        System.out.println("\nGrooming the gorilla:");
        gorilla.groom();
        
        System.out.println("\nPet the gorilla:");
        gorilla.pet();
    }
}
