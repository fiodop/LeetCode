public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(arr, 1));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 1;
        int answ = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                cnt++;
            } else {
                answ += (cnt - 1) / 2;
                cnt = 0;
            }
        }
        cnt ++;
        answ += (cnt - 1) / 2;
        return answ >= n;
    }
}
// 1 0 0 0 0 0 0 1 0 0 1