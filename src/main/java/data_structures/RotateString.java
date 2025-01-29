package data_structures;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }
    public static boolean rotateString(String s, String goal) {
        StringBuilder tmp = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            if((tmp.toString()).equals(goal)){
                return true;
            }
            else {
                String letter = String.valueOf(tmp.charAt(s.length() - 1));
                tmp.deleteCharAt(s.length() - 1);
                tmp.insert(0, letter);
            }
        }
        return false;
    }
}
