import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0, idxL = 0;
        int idxR = people.length - 1;
        
        Arrays.sort(people);
        
        while(idxL <= idxR) {
            if(people[idxL] + people[idxR] <= limit) {
                idxL++;
            }  
            idxR--;
            answer++;
        } 
        
        return answer;
    }
}