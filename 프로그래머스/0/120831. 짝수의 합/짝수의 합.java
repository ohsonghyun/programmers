class Solution {
    public int solution(int n) {
        int answer = 0, num = 2;
        
        while(num <= n) {
            if(num % 2 == 0) {
                answer += num;
            }
            num += 2;
        }
        
        return answer;
    }
}