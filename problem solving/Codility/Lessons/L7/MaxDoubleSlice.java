package L7;

/**
 * Created by rashed on 8/29/15.
 * 100%
 * inspired by Rafal's post "http://rafal.io/posts/codility-max-double-slice-sum.html"
 */
public class MaxDoubleSlice {


    class Solution {
        public int solution(int[] A) {

            int n = A.length;
            int r [] = new int[n+1];
            int l[] = new int[n+1];

            for(int i=1;i<n-1;i++)
                r[i] = Math.max(A[i]+r[i-1],0);

            for(int j=n-2;j>0;j--)
                l[j] = Math.max(A[j]+l[j+1],0);

            int max = 0;

            for(int i=1;i<n-1;i++)
                max = Math.max(max,r[i-1]+l[i+1]);
            return max;

        }
    }

}
