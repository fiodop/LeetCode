import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
    //3[a2[c]]
    //]]c[2a[3
    //a2[c]a2[c]a2[c]
    public static String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> strs = new Stack<>();
        int n = 0;
        String tmp = "";
        for(Character ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                n = n * 10 + (ch - '0');
            } else if (ch == '['){
                strs.push(tmp);
                nums.push(n);
                n = 0;
                tmp = "";
            }else if (ch == ']'){
                StringBuilder decodedStr = new StringBuilder(strs.pop());
                int cnt = nums.pop();
                for(int i = 0; i < cnt; i++){
                    decodedStr.append(tmp);
                }
                tmp = decodedStr.toString();
            }else {
                tmp += ch;
            }
        }
        return tmp;
    }

}


