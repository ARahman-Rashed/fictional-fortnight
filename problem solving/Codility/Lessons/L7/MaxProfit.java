package L7;

/**
 * Created by rashed on 8/29/15.
 * 100%
 */
public class MaxProfit {
    class Solution {
        public int solution(int[] A) {
            long s=0,e=0;
            for(int i=A.length-1;i>0;i--){
                e = Math.max(0,e+A[i]-A[i-1]);
                s= Math.max(s,e);
            }
            return s>0 ? (int) s:0;
        }
    }
}
