class Solution {
    public String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer();
        
        for(char x : s.toCharArray()) {
            for (int i = 0; i < index; i++) {
                x++;
                x -= x > 'z' ? 26 : 0;
                i -= skip.contains(String.valueOf(x)) ? 1 : 0;
            }
            sb.append(x);
        }
        
        return sb.toString();
    }
}