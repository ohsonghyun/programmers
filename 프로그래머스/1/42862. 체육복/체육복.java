import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int cnt = 0;
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -10;
                    reserve[j] = -5;
                    cnt++;
                    break;
                }
            }
        }
        
        int answer = n - lost.length + cnt;

        for(int losted : lost) {
            for(int i = 0; i < reserve.length; i++) {
                int reserved = reserve[i];
                if(losted <= reserved + 1 && losted >= reserved - 1) {
                    reserve[i] = -1;
                    answer++;
                    break;
                } 
            }
        }
        return answer;
    }
}