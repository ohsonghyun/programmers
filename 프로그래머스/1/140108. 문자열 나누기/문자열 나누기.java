class Solution {
    public int solution(String s) {
        int answer = 0;
        String x = "";
        int same = 0;
        int different = 0;
        int cnt = 0;
        
        for(String str : s.split("")) {
            cnt++;
            
            if(same == 0 && different == 0) {
                x = str;
            }
            
            if(str.equals(x)) {
                same++;
            } else {
                different++;
            }
            
            if(same != 0 && different != 0 && same == different) {
                answer++;
                same = 0;
                different = 0;
            }else if(cnt == s.length()) {
                answer++;
            }
        }
        
        return answer;
    }
}