import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashMap<String, Integer> map = new HashMap();
        map.put(words[0], 0);
        
        for(int i = 1; i < words.length; i++) {
            String word = words[i];
            String preWord = words[i - 1].substring(words[i-1].length() - 1);
            
            if(map.containsKey(word)) {
                return new int[] {i % n + 1, i / n + 1};
            }else if(!word.startsWith(preWord)) {
                return new int[] {i % n + 1, i / n + 1};
            }
            
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        return new int[] {0, 0};
    }
}