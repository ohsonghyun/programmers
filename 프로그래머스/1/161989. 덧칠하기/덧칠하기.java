class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int si = 0;
        int position = 0;
        
        while(position <= n && si < section.length) {
            if(section[si] <= position) {
                si++;
            } else {
                position = section[si] + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}