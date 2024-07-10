public class NumberOfWaysToSplitAString {
    public int numWays(String s) {
        int totalOnes = 0;
        int MOD = 1000000007;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                totalOnes++;
            }
        }

        if (totalOnes % 3 != 0){
            return 0;
        }
        if(totalOnes == 0){
            int n = s.length();
            return (int) (((long) (n - 1) *(n - 2)) / 2) % MOD;
        }
        int targetOnes = totalOnes / 3;
        int currentOnes = 0;
        long ways1 = 0; long ways2 = 0;

        for(char c : s.toCharArray()){
             if(c == '1'){
                currentOnes++;
             }
             if(currentOnes == targetOnes){
                 ways1++;
             }
              else if(currentOnes == 2 * targetOnes){
                 ways2++;
             }
        }
        return (int) (ways1 * ways2) % MOD;
    }
}
