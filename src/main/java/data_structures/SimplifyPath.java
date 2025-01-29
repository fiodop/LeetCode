package data_structures;

import java.util.ArrayList;
import java.util.Stack;

public class SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        StringBuilder tmp = new StringBuilder();
        StringBuilder answ = new StringBuilder();
        for (char c : path.toCharArray()) {
            if (c != '/'){
                tmp.append(c);
            } else {
                switch (tmp.toString()){
                    case "..":
                        tmp.setLength(0);
                        stack.pop();
                        break;

                    case ""
                    default:
                        stack.push(tmp.toString());
                }
            }
        }
    }
}
