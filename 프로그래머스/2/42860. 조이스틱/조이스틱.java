class Solution {
    public int solution(String name) {
        int answer = 0;
        int nameLength = name.length();
        int minMove = nameLength - 1;
        
        for(int i = 0; i < nameLength; i++) {
            int asciiCode = (int) name.charAt(i);
            answer += 78 >= asciiCode ? (asciiCode - 65) : (91 - asciiCode);
            System.out.println(answer);
            
             // 커서 이동 횟수 계산
            int nextIndex = i + 1;
            while (nextIndex < nameLength && name.charAt(nextIndex) == 'A')
                nextIndex++;

            int move = i + nameLength - nextIndex + Math.min(i, nameLength - nextIndex);
            minMove = Math.min(minMove, move);
        }
        
        return answer + minMove;
    }
}