package L2;
import java.util.HashSet;
/**
 * Created by rashed on 8/7/15.
 * 100%
 */
public class MissingInteger {
    class Solution {
        public int solution(int[] A) {
            HashSet<Integer> h = new HashSet<Integer>();
            for(int i:A){
                h.add(i);
            }
            for(int i=1;i<=h.size()+1;i++)
                if(!h.contains(i))
                    return i;
            return -1;
        }
    }
}
