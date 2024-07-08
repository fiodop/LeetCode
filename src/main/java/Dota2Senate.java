import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Dota2Senate {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("DDRRR"));
    }
    public static String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for(int i = 0; i < senate.length(); i++){
            if(senate.charAt(i) == 'R'){
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }

        while (!radiant.isEmpty() && dire.isEmpty()){
            int rIndex = radiant.poll();
            int dIndex = dire.poll();

            if(rIndex < dIndex){
                radiant.add(rIndex + senate.length());
            } else{
                dire.add(dIndex + senate.length());
            }
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
