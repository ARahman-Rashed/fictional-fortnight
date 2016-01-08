package L3;

/**
 * Created by rashed on 8/8/15.
 * 100 %
 */
public class PassingCars {
    class Solution {
        public int solution(int[] A) {
            long res = 0,ones=0;
            for(int i=A.length-1;i>=0;i--){
                if(A[i]==1)
                    ones++;
                else{
                    res+=ones;
                }
            }
            return res>1000000000 ? -1:(int)res;
        }
    }
}
