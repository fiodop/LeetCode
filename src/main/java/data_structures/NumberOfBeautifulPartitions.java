package data_structures;

import java.math.BigInteger;

public class NumberOfBeautifulPartitions {
    public int beautifulPartitions(String s, int k, int minLength) {
        int primelength = minLength;
        int nonPrimelength = minLength;
        int cnt = 0;
        boolean allah = true;
        while (allah){
            if(isDigitPrime(Integer.parseInt(s.substring(s.length() - primelength)))){
                if(s.length() - primelength >= minLength * 2){
                    if(!isDigitPrime(Integer.parseInt(s.substring(0, nonPrimelength)))){
                        if((s.length() - primelength - nonPrimelength)/ (k - 2) >= minLength){
                            cnt++;
                        } else {
                            allah = false;
                        }
                    } else {
                        nonPrimelength++;
                    }
                }

            } else {
                primelength++;
            }
        }
        return cnt;
    }

    private boolean isDigitPrime(int n){
        BigInteger bigInteger = BigInteger.valueOf(n);
        return bigInteger.isProbablePrime((int) Math.log(n));
    }
}
