package L2;

/**
 * Created by rashed on 8/8/15.
 * 88 %
 */
public class MaxCounters {

    class Solution {
        public int[] solution(int N, int[] A) {

            int [] counter = new int[N];
            int applied_max=0,current_max=0,pos=-1;
            // any counter value is equal to : applied max + it's own value
            // except for the counter with the greatest value that initiated the applied max
            for (int i=0; i<A.length;i++){
                if(A[i] <= N){
                    counter[A[i]-1]++;
                    current_max = Math.max(current_max,applied_max + counter[A[i]-1]);
                }
                else {
                    applied_max = current_max;
                    pos = i;
                    counter = new int[N];
                }
            }

            int [] res = new int[N];
            for(int i = pos+1;i<A.length;i++)
                res[A[i]-1]++;
            for(int i=0;i<N;i++)
                res[i]+=applied_max;

            return res;



        }
    }

    // 100%

    class Solution2 {
        public int[] solution(int N, int[] A) {

            int [] counter = new int[N];
            int applied_max=0,current_max=0;
            for (int i=0; i<A.length;i++){
                if(A[i] <= N){
                    counter[A[i]-1] = Math.max(counter[A[i]-1],applied_max);
                    counter[A[i]-1]++;
                    current_max = Math.max(current_max,counter[A[i]-1]);
                }
                else {
                    applied_max = current_max;
                }
            }

            for(int i=0;i<N;i++)
                counter[i] = Math.max(applied_max,counter[i]);

            return counter;



        }
    }





}
