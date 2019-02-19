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

