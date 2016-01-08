package L3;

/**
 * Created by rashed on 8/8/15.
 * 100 %
 */
public class CountDiv {
    class Solution {
        public int solution(int A, int B, int K) {
            if(A%K==0)
                return (B-A)/K +1;
            return (B-(A-(A%K)))/K;
        }
    }
}
