// 소수 찾기 (https://school.programmers.co.kr/learn/courses/30/lessons/12921)
  
import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
            answer += isPrime(i) ? 1 : 0;
        }
        
        return answer;
    }
    
    
    public boolean isPrime(int n) {
        for (int i = 2; i <= (int)Math.sqrt(n); i++) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
