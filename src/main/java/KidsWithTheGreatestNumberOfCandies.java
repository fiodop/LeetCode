import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> answ = new ArrayList<>();
            int max = candies[0];
            for(int i = 1; i < candies.length; i++){
                if(candies[i] > max){
                    max = candies[i];
                }
            }
            for(int i = 0; i < candies.length; i++){
                if (candies[i] + extraCandies < max){
                    answ.add(false);
                } else {
                    answ.add(true);
                }
            }
            return answ;
        }
}
