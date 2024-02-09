import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keypad = new HashMap<>();
        
        for(int i = 0; i < keymap.length; i++) {
            for(int j = 0; j < keymap[i].length(); j++) {
                char key = keymap[i].charAt(j);
                if(keypad.containsKey(key) && keypad.get(key) < j + 1) continue;
                keypad.put(key, j + 1);
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            boolean flag = true;
            for(char target : targets[i].toCharArray()) {
                if(keypad.containsKey(target)) {
                    answer[i] += keypad.get(target);
                } else {
                    flag = false;
                    break;
                }
            }
            if(!flag) {
                answer[i] = -1;
            } 
        }
        
        return answer;
    }
}