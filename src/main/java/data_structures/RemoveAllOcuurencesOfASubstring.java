package data_structures;

public class RemoveAllOcuurencesOfASubstring {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("axxxxyyyyb", "xy"));
    }

    public static String removeOccurrences(String s, String part) {
        boolean removed;
        StringBuilder answ  = new StringBuilder(s);
        do {
            removed = false;
            if(answ.length() < part.length()){
                break;
            }

            if(answ.equals(part)){
                answ = new StringBuilder();
                break;
            }
            for(int l = 0; l < answ.length() - part.length() + 1; l++) {
                int r = l + part.length();

                if(answ.substring(l, r).equals(part)) {
                    removed = true;
                    answ.delete(l, r);
                    break;
                }
            }
        } while (removed);
        return answ.toString();
    }
}
