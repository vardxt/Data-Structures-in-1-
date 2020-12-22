public class Fibnocci {

    //Check number is fib or not ex:0 1 1 2 3 5 8 13 21.... (addition of prev 2 num )
    public static int fibbi(int n) {

        if (n <= 1) {
            return 1;

        } else {
            return fibbi(n - 1) + fibbi(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibbi(5));
    }
}
