/*
Mając daną tablicę, tak długo wykonywać operację, aż natrafimy na liczbę -1.
Zakładamy, że rozpoczynamy od elementu 0.
Zakłądamy, że dla testowych danych zawsze możemy wykonaćoperację.
Wykonujemy następującą operację: array[0] -> array[array[index]].
Program powininen zwrócić liczbę operacji.

Dla wywołania findMinus1[2,1,3,4,5,-1] oczekiwany wynik to 5
array[0] = 2 -> array[2] = 3 -> array[3] = 4 -> array[4] = 5 -> array[5] = -1
 */


public class FindMinus1 {

    public static void main(String args[]){

        int [] tab = {2,1,3,4,5,-1};
        System.out.println(findMunis1(tab));
    }

    public static int findMunis1(int[] A){
        int counter = 1;
        int index = 0;
        if (A.length>0) {
            while (A[index] != -1) {
                index = A[index];
                counter++;
            }
        } else counter = 0;
        return counter;
    }
}

