import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int index = 0;
        char tmp = chars[0];
        int cnt = 0;

        for (int i = 0; i < chars.length; i++) {
            if (tmp == chars[i]) {
                cnt++;
            } else {
                chars[index++] = tmp;
                if (cnt > 1) {
                    for (char c : Integer.toString(cnt).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                tmp = chars[i];
                cnt = 1;
            }
        }


        chars[index++] = tmp;
        if (cnt > 1) {
            for (char Ж
                 c : Integer.toString(cnt).toCharArray()) {
                chars[index++] = c;
            }
        }

        return index;
    }
}
