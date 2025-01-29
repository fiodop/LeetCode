public class MakeFancyString {
    public static void main(String[] args) {
        System.out.println(makeFancyString("sssaaaqqq"));
    }
    public static String makeFancyString(String s) {
        int cnt = 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt <= 2) {
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
