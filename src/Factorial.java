/*
Napisać funkcję, która jako argument pobiera liczbę n i oblicza n!
Dla wywołania factorial(5) oczekiwany wynik to 120.
 */

public class Factorial {

    public static void main (String [] args){

    System.out.println(factorial(6 ));
    }

    public static long factorial(int n){
        long result = 1;
        if (n != 0) {
            for (int i = 2; i <= n; i++) {
                result *= (long)i;
            }
        }
        return result;
    }
}
