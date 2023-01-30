public class Logical {
    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       int c = 20;
       int d = 0;
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
            else
            System.out.println("False conditions");

    }
}
