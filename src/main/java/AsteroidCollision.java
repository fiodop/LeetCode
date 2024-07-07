import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {1,-2,-2,-2};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> steroids = new Stack<>();
        steroids.add(asteroids[0]);
        for (int i = 1; i < asteroids.length; i++){
            if(!steroids.isEmpty() && steroids.getLast() > 0 && asteroids[i] < 0){
                if(Math.abs(steroids.getLast()) > Math.abs(asteroids[i])){
                    i++;
                } else if(Math.abs(steroids.getLast()) < Math.abs(asteroids[i])){
                    steroids.pop();
                } else if (Math.abs(steroids.getLast()) == Math.abs(asteroids[i])){
                    steroids.pop();
                    i++;
                }
                i--;
            } else {
                steroids.add(asteroids[i]);
            }
        }
        int[] answ = new int[steroids.size()];
        int index = 0;
        for(int n : steroids){
            answ[index] = n;
            index++;
        }
        return answ;
    }
}
//5,10,-5
