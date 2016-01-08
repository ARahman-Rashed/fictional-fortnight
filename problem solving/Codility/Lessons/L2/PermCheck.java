package L2;

/**
 * Created by rashed on 8/7/15.
 * 100%
 */
public class PermCheck {
    class Solution {
        public int solution(int[] A) {
            int [] arr = new int[A.length];
            for(int i=0;i<A.length;i++){
                if(A[i]<1 || A[i]>A.length)
                    return 0;
                if(arr[A[i]-1]!=0)
                    return 0;
                else arr[A[i]-1]=1;
            }
            return 1;
        }
    }


}
