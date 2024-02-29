import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] clothing : clothes) {
            map.put(clothing[1], map.getOrDefault(clothing[1], 0) + 1);
        }

        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        
        return answer - 1;
    }
}