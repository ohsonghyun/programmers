class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(String str : s.split("")) {
            char ch = str.charAt(0);
            
            if(Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if(Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            
            answer += ch;
        }
        return answer;
    }
}