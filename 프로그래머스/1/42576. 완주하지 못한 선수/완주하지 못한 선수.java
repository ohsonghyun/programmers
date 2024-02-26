import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(String participants : participant) {
            map.put(participants, map.getOrDefault(participants, 0) + 1);
        }
        
        for(String completions : completion) {
            map.put(completions, map.get(completions) - 1);
        }
        
        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}