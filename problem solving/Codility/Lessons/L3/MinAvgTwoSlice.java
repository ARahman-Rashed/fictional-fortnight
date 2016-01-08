package L3;

/**
 * Created by rashed on 8/8/15.
 * 60 %
 */
public class MinAvgTwoSlice {


    class Solution {

        double count_total(long [] P, int x,int y){
            return P[y+1] - P[x];
        }


        public int solution(int[] A) {

            long prefix[] = new long[A.length+1];
            int idx = 0, len=2;
            double avg = Double.MAX_VALUE;
            for(int i=1;i<=A.length;i++)
                prefix[i] = A[i-1]+prefix[i-1];

            for(int i=0;i<A.length-1;i++)
                if(count_total(prefix,i,i+1)/2 < avg){
                    avg = (double)(A[i]+A[i+1])/2;
                    idx = i;
                }

            while(len<A.length){
                len++;
                double cand1=Double.MAX_VALUE, cand2 = Double.MAX_VALUE;
                if(idx > 0 && idx+len-2<A.length)
                    cand1 = count_total(prefix,idx-1,idx+len-2)/len;

                if(idx+len-1 < A.length)
                    cand2 = count_total(prefix,idx,idx+len-1)/len;

                if(cand1<cand2 && cand1 < avg){
                    avg = cand1;
                    idx = idx-1;
                }
                else if(cand2<cand1 && cand2<avg){
                    avg = cand2;
                }
            }

            return idx;

        }

    }


    // 100 %
    class Solution2 {

        double count_total(int[] P,int x,int y){

            return P[y+1]-P[x];

        }


        public int solution(int[] A) {
            double avg = Double.MAX_VALUE;
            int [] p = new int[A.length+1];
            int idx = 0;
            for(int i=1;i<=A.length;i++)
                p[i] = p[i-1] + A[i-1];
            //    System.out.println(count_total(p,0,1));
            for(int i=0;i<A.length-1;i++)
                if(count_total(p,i,i+1)/2 < avg){
                    avg =  count_total(p,i,i+1)/2;
                    idx = i;
                }
            for(int i=0;i<A.length-2;i++)
                if(count_total(p,i,i+2)/3 < avg){
                    avg = count_total(p,i,i+2)/3;
                    idx = i;
                }

            return idx;



        }
    }


}
