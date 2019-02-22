/*
Program w podanej tablicy wyszujuje spójny ciąg o największej sumie elementów i zwraca tę sume.
Dla tablicy [1, 5, -100, 5, 10, 2, 5] oczekiwany wynik to 22.
Oczekiwany złożoność to O(n)
 */

import java.util.*;

public class sumMaxSequence {

    public static void main(String [] args){
        int tab1[] = {1,5,-100,5,10,2,5};
        int tab2[] = {1,2,3,4,5};
        int tab3[] = {1,5,-3,1,2,4,-11,5,-1,-5,-7,2,3,-1,4};
        System.out.println(efficientSumMaxSequence(tab1));

    }

    /* W tej wersji funkcja wylicza wszystkie sumy częściowe,
    dodaje je do TreeSet (gdzie są automatycznie sortowane)
    i zwraca ostatni (a więc największy) element.
    */
    public static long sumMaxSequence(int [] A){
        TreeSet<Long> treeSet = new TreeSet<>();
        long sum = 0;
        for (int k = 0; k < A.length-1; k++) {
            //System.out.println("K = " + k);
            for (int l = A.length-1; l > 0 + k; l--) {
                //System.out.println("L = " + l);
                for (int i = k; i <= l; i++) {
                    //System.out.println("I = " + i);
                    sum += A[i];
                }
                //System.out.println("Suma = " + sum);
                treeSet.add(sum);
                sum = 0;
            }
        }
        return treeSet.last();
    }

    public static long efficientSumMaxSequence(int [] A) {
        long sum = 0;
        long maxSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum >= 0) {
                sum += A[i];
            } else {
                sum = 0;
                sum += A[i];
            }
            if (maxSum < sum)
                maxSum = sum;
        }
        return maxSum;
    }
}
