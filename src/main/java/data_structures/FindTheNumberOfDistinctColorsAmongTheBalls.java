package data_structures;

import java.util.HashMap;

public class FindTheNumberOfDistinctColorsAmongTheBalls {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> balls = new HashMap<>();
        HashMap<Integer, Integer> colorCounter = new HashMap<>();
        int[] answ = new int[queries.length];
        int uniqueColors = 0;
        for(int i = 0; i < queries.length; i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            if(balls.containsKey(ball)){
                int oldColor = balls.get(ball);
                colorCounter.put(oldColor, colorCounter.get(oldColor) + 1);

                if(colorCounter.get(oldColor) == 0){
                    colorCounter.remove(oldColor);
                    uniqueColors--;
                }
            }

            balls.put(ball, color);
            colorCounter.put(color, colorCounter.getOrDefault(color, 0) + 1);

            if(colorCounter.get(color) == 1){
                uniqueColors++;
            }

            answ[i] = uniqueColors;
        }

        return answ;
    }
}
