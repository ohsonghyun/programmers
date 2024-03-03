import java.util.*;

class Solution {
    String[] vowel = {"A", "E", "I", "O", "U"};
    Set<String> set;
    public int solution(String word) {
        set = new TreeSet();
        
        for(int i = 0 ; i < 5; ++i)
            dictionary(vowel[i], 1);
        
        int count = 0;
        for(String s : set){
            count++;
            if(s.equals(word)) return count;
        }
        
        return 0;
    }
    
    public void dictionary(String s, int depth){
        set.add(s);
        
        if(depth == 5){
            return;
        }
       
        for(int i = 0 ; i < 5; ++i)
            dictionary(s + vowel[i], depth + 1);
    }
}