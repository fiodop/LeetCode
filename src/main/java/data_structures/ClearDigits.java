package data_structures;

public class ClearDigits {

    public static void main(String[] args) {
        System.out.println(clearDigits("abc34"));
    }
    public static String clearDigits(String s) {
        StringBuilder answ = new StringBuilder(s);
        boolean removed;

        do {
            removed = false;
            for (int i = 0; i < answ.length(); i++) {
                if (Character.isDigit(answ.charAt(i))) {
                    removeDigit(answ, i);
                    removed = true;
                    break;
                }
            }
        } while (removed);

        return answ.toString();
    }

    private static void removeDigit(StringBuilder s, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (!Character.isDigit(s.charAt(i))) {
                s.deleteCharAt(i);
                index--;
                break;
            }
        }

        s.deleteCharAt(index);
    }


}
// ac4
// 0123