package L3;

/**
 * Created by rashed on 8/29/15.
 *  100% (Credits for the idea to Rafal ( http://rafal.io/posts/codility-genomic-range-query.html )
 */
public class GenomicRangeQuery {


    class Solution {
        public int[] solution(String S, int[] P, int[] Q) {

            int arr[][] = new int[S.length()][4];
            int [] res = new int[P.length];
            int idx = 0;
            for(int i=0;i<S.length();i++){
                if(S.charAt(i)=='A')
                    arr[i][0] = 1;
                else if(S.charAt(i)=='C')
                    arr[i][1]= 1;
                else if(S.charAt(i)=='G')
                    arr[i][2] = 1;
                else arr[i][3] = 1;
            }

            for(int i=1;i<S.length();i++)
                for(int j=0;j<4;j++)
                    arr[i][j]+=arr[i-1][j];

            for(int i=0;i<P.length;i++){
                int x = P[i], y= Q[i];
                for(int j=0;j<4;j++){
                    int bef = x > 0 ? arr[x-1][j] : 0;
                    if(arr[y][j]-bef>0){
                        res[idx] = j+1;
                        idx++;
                        break;
                    }
                }
            }
            return res;
        }

    }

}
