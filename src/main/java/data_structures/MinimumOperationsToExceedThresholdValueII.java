package data_structures;

import java.util.*;

public class MinimumOperationsToExceedThresholdValueII {

    public static void main(String[] args) {
        int[] arr = new int[]{2,11,10,1,3};
//        System.out.println(minOperations(arr, 10));
    }
//    public static int minOperations(int[] nums, int k) {
//        Arrays.sort(nums);
//        int cnt = 0;
//        ArrayDeque<Integer> queue = new ArrayDeque<>();
//        for (int num : nums) {
//            queue.addLast(num);
//        }
//
//        boolean smaller;
//        do{
//            smaller = true;
//            if(isArrayBiggerThanNum(queue, k)){
//                smaller = false;
//            } else {
//                cnt++;
//                if(queue.size() >= 2) {
//                    queue.addLast(operation(queue.pollFirst(), queue.pollFirst()));
//                    ArrayList<Integer> arr = new ArrayList<>(queue);
//                    Collections.sort(arr);
//                    queue = new ArrayDeque<>(arr);
//                }
//            }
//        }while (smaller);
//        return cnt;
//    }
//
//    private static int operation(int x, int y){
//        return Math.min(x, y) * 2 + Math.max(x, y);
//    }
//
//    private static boolean isArrayBiggerThanNum(ArrayDeque<Integer> queue, int k){
//
//        for(int num : queue){
//            if(num < k){
//                return false;
//            }
//        }
//        return true;
//    }


    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> queque = new PriorityQueue<>();

        for (int num : nums) {
            queque.offer(num);
        }

        int cnt = 0;

        while (queque.size() > 1 && queque.peek() < k) {
            int x = queque.poll();
            int y = queque.poll();
            int newElement = Math.min(x, y) * 2 + Math.max(x, y);
            queque.offer(newElement);
            cnt++;
        }

        return queque.peek() >= k ? cnt : -1;
    }

}
