class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuffer sb = new StringBuffer(answer);
        
        for(int i = 0; i < food.length; i++) {
            int cnt = food[i];
            while(cnt / 2 >= 1) {
                sb.append(i);
                cnt -= 2;
            }
        }
        
        return sb.toString() + "0" + sb.reverse().toString();
    }
}