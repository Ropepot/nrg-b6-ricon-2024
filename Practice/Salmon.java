package Practice;

 public class Salmon {
            int count;
            public void Salmon() {
                count = 4;
              }
            public static void main(String[] args) {
               Salmon s = new Salmon();
               System.out.println(s.count);
     } }

      class Price {
        public void admission() {
        
        }
        public static void main(String[] args) {
            double amount = 0xE;
        System.out.println(amount);
} }

 class Bear {
    protected void finalize() {
    System.out.println("Roar!");
}
public static void main(String[] args) {
   Bear bear = new Bear();
   bear = null;
   System.gc();
} }


