import java.util.*;

class Solution {
    public int solution(String s) {
        String answer = "";
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String temp = "";
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(96 < ch && ch < 123) {
                temp += ch;
                if(Arrays.asList(num).contains(temp)) {
                    answer += Arrays.asList(num).indexOf(temp);
                    temp = "";
                }
                continue;
            }
            answer += ch;
        }
        
        return Integer.parseInt(answer);
    }
}