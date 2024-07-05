import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] arr = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int position = 0;
        int max  = 0;
        for(int i = 0; i < gain.length; i++){

            if(position > max){
                max = position;
            }
            position += gain[i];

        }
        if(position > max){
            max = position;
        }
        return max;
    }
}
//-5,1,5,0,-7