public class SplitTwoStringstoMakePalindrome {
    public static void main(String[] args) {
        SplitTwoStringstoMakePalindrome a = new SplitTwoStringstoMakePalindrome();
        System.out.println(a.checkPalindromeFormation("ulacfd", "iizalu"));
    }
    public boolean checkPalindromeFormation(String a, String b) {
        for (int i = 0; i < a.length(); i++){
            String aPrefix = a.substring(0, i);
            String aSuffix = a.substring(i, a.length());

            String bPrefix = b.substring(0, i);
            String bSuffix = b.substring(i, b.length());
            if((aPrefix + bSuffix).contentEquals(new StringBuilder(aPrefix + bSuffix).reverse())
                || (bPrefix + aSuffix).contentEquals(new StringBuilder(bPrefix + aSuffix).reverse())) {
                return true;
            }
        }
        return false;
    }
}
