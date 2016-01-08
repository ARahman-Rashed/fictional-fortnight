package L2;

/**
 * Created by rashed on 8/7/15.
 * 90%
 */
public class FrogRiverOne {
    class Solution {
        public int solution(int X, int[] A) {
            int [] arr = new int[X+1];
            long sum  = ((long)X*(X+1))/2 ;
            int counter = 0,i=0;
            while(counter != sum && i<A.length){
                if(A[i] <= X && arr[A[i]]==0){
                    //    System.out.println(counter);
                    arr[A[i]] = 1;
                    counter+=A[i];
                    if(counter==sum)
                        break;
                }
                i++;
            }
            return sum!=counter ? -1:i;
        }
    }
}
