package L5;

import java.util.*;

/**
 * Created by rashed on 8/12/15.
 * 100%
 */
public class Nesting {

    class Solution {
        public int solution(String S) {
            if(S.length()==0)
                return 1;
            Queue<Character> q = new LinkedList<Character>();
            for(int i=0;i<S.length();i++)
                if(S.charAt(i)==')'){
                    if(q.isEmpty()||q.poll()!='(')
                        return 0;
                }
                else q.add(S.charAt(i));
            return q.isEmpty()?1:0;

        }
    }
}
