import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int idx = 0; idx < moves.length; idx++) {
            int move = moves[idx];
            for(int i = 0; i < board.length; i++) {
                if(board[i][move - 1] != 0) {
                    if(stack.peek() == board[i][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][move - 1]);
                    } 
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        
        
        
        return answer;
    }
}