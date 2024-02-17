import java.util.Arrays;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        String hamburger = "1231";
        StringBuilder sb = new StringBuilder();
        
        for(int i : ingredient) {
            sb.append(i);
            
            if(sb.length() > 3 && 
               sb.charAt(sb.length() - 1) == '1' &&
               sb.charAt(sb.length() - 2) == '3' &&    
               sb.charAt(sb.length() - 3) == '2' &&
               sb.charAt(sb.length() - 4) == '1') {   
               
                answer++;
                sb = new StringBuilder(sb.substring(0, sb.length() - 4)); 
            }
        }
        
        return answer;
    }
}