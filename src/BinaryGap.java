import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BinaryGap {


    @Test
    public void testSolution(){
        assertEquals(4, new BinaryGap().solution1(529));
    }


    public int solution1(int n){
        int count = 0;
        int longest = 0;
        boolean flag = false;
        for (int i=0; i<32;i++){
            if ((n & 1) == 1){
                if (flag == false)
                    flag = true;
                else
                    if (count > longest)
                        longest = count;
                    count = 0;
            } else
                if (flag == true)
                    count++;
            n = n >> 1;
        }
        return longest;
    }

    public int solution2(int n) {
        int firstOneIndex = 0;
        int counter = 0;
        int longest = 0;
        for (int i = 0; i < 32; i++) {
            if ((n >> i & 1) == 1) {
                firstOneIndex = i;
                break;
            }
        }
        for (int i = firstOneIndex; i < 32; i++) {
            if ((n >> i & 1) == 0)
                counter++;
            else {
                if (counter > longest)
                    longest = counter;
                counter = 0;
            }
        }
        return longest;
    }
}
