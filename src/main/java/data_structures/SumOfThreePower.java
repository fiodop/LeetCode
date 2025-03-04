package data_structures;

public class SumOfThreePower {
    public boolean checkPowersOfThree(int n) {
        String s = toThirdPresentation(n);

        return !s.contains("2");

    }

    private static String toThirdPresentation(int n) {
        String str = "";
        while (n != 0) {
            str = str + n % 3;
            n = n / 3;
        }
        return str;
    }
}
