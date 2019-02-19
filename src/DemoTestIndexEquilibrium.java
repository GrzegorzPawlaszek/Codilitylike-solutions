public class DemoTestIndexEquilibrium {
    
    public static void main (String args[]){
        int tab[] = {2,4,-1,8,5,0,3,9,1,1,-21};

        System.out.println(efficientIndexEquilibrium(tab));
    }
    
    public static int indexEquilibrium (int [] A){
        int beforeSum = 0;
        int afterSum = 0;

        for (int i=1;i<A.length-1;i++){
            for (int j=0;j<A.length;j++){
                if (j<i)
                    beforeSum += A[j];
                else if (j>i)
                    afterSum += A[j];
            }
            if (beforeSum == afterSum) {
                return i;
            } else {
                beforeSum = 0;
                afterSum = 0;
            }
        }
        return -1;
    }

    public static int efficientIndexEquilibrium (int []A) {
        if (A.length==0)
            return -1;
        long afterSum = 0;
        long beforeSum = 0;
        for (int i = 0; i < A.length; i++)
            afterSum += (long)A[i];
        for (int i = 1; i < A.length - 1; i++) {
            beforeSum += (long)A[i - 1];
            afterSum -= (long)A[i-1];
            if (beforeSum == (afterSum - A[i]))
                return i;
        }
        return -1;
    }
}
