public class Factorial {

    public static int fact(int n) {
        //Base Condition
        if (n == 0) {
            return 1;
        } else {
            //Recursive Condition
            return (n * fact(n - 1));
        }
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        //5*4*3*2*1 = 120
    }
}
