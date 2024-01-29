import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        double[] temp = new double[N];
        int challenger = stages.length;
       
        for(int fail : stages) {
            if(fail > N) {
                continue;
            } else {
                temp[fail - 1] += 1;
            }
        }
        
        Map<Integer, Double> map = new HashMap<>();
        for(int i = 0; i < temp.length; i++) {
            int loser = (int)temp[i];
            if(challenger < 1) {
                map.put(i + 1, 0.0);
            } else {
                temp[i] /= challenger;
                map.put(i + 1, temp[i]);
                challenger -= loser;
            }
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return list.stream().mapToInt(i -> i).toArray();
    }
}