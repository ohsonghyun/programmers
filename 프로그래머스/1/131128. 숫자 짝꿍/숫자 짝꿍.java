import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] arrX = makeArr(X);
        int[] arrY = makeArr(Y);
        
        for(int i = 9; i >= 0; i--) {
            while(arrX[i] > 0 && arrY[i] > 0) {
                sb.append(i);

                arrX[i]--;
                arrY[i]--;
            }
        }
        String answer = sb.toString();
        return "".equals(answer) ? "-1" : answer.startsWith("0") ? "0" : answer;
    }
    
    public int[] makeArr(String S) {
        int[] arrS = new int[10];
        for(String s : S.split("")) {
            arrS[Integer.parseInt(s)]++;
        }
        return arrS;
    }
}