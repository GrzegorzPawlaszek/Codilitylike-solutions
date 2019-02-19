public class Factorial {

    public static void main (String [] args){

    System.out.println(factorial(6 ));
    }

    public static long factorial(int n){
        int result = 1;
        if (n != 0) {
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
}
