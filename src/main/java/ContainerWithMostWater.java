public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heigth = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heigth));
    }
    public static int maxArea(int[] height) {
        int maxLeft = 0;
        int maxRigth = height.length - 1;
        int maxWater;
        int tmpMaxWater;
        int answ = 0;
        while (maxRigth > maxLeft){
            maxWater = Math.min(height[maxLeft], height[maxRigth]);
            tmpMaxWater = maxWater * (maxRigth - maxLeft);

            if(tmpMaxWater > answ){
                answ = tmpMaxWater;
            }
            if (height[maxLeft] > height[maxRigth]){
                maxRigth--;
            }else {
                maxLeft++;
            }
        }
        return answ;
    }
}
