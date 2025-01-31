package data_structures;

import java.util.Arrays;

public class MatchSticksToSquare {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        Arrays.sort(matchsticks);
        reverseArray(matchsticks);
        for(int i = 0; i < matchsticks.length; i++){
            sum += matchsticks[i];
        }

        if(sum % 4 != 0) return false;
        int[] square = new int[4];
        int sideLength = sum / 4;

        return checkMatchstick(matchsticks, 0, square, sideLength);

    }
    private boolean checkMatchstick(int[] matchsticks, int index, int[] square, int sideLength) {
        if(index == matchsticks.length - 1 && square[0] == square[1] && square [1] == square[2] && square[2] == square[3]){
            return true;
        }

        for(int i = 0; i < square.length; i++){
            if(square[i] + matchsticks[index] > sideLength) return false;

            square[i] += matchsticks[index];

            if(checkMatchstick(matchsticks, index + 1, square, sideLength)) return true;

            square[i] -= matchsticks[index];

            if (square[i] == 0) break;
        }
        return false;
    }

    private void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
