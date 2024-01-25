class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int length = number.length;
        
        for(int i = 0; i < length - 2; i++) {
            for(int j = i + 1; j < length - 1; j++) {
                for(int z = j + 1; z < length; z++){
                    if(number[i] + number[j] + number[z] == 0) {
                        answer++;
                    }
                } 
            }
        }
        
        return answer;
    }
}