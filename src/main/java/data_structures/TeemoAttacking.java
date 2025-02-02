package data_structures;

public class TeemoAttacking {
    public static void main(String[] args) {
        int[] time = new int[]{1, 4};
        System.out.println(findPoisonedDuration(time, 2));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int cnt = 0;

        for(int i = 0; i < timeSeries.length - 1; i++) {
            if(timeSeries[i] + duration <= timeSeries[i + 1]) {
                cnt +=duration;
            } else {
                cnt += timeSeries[i + 1] - timeSeries[i];
            }
        }

        return cnt + duration;
    }
}
// [1, 4, 5]