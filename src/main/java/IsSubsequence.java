public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty() && !t.isEmpty()){
            return false;
        }
        int indexT = 0;
        for (int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(indexT)) {
                indexT++;
                if (indexT == s.length()){
                    return true;
                }
            }
        }
        return indexT == s.length();
    }
}
