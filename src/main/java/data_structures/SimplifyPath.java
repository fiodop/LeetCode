package data_structures;

import java.util.Stack;


public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder tmp = new StringBuilder();
        StringBuilder answ = new StringBuilder();

        for (char c : (path + "/").toCharArray()) {
            if (c != '/') {
                tmp.append(c);
            } else {
                String dir = tmp.toString();
                tmp.setLength(0);

                switch (dir) {
                    case "..":
                        if (!stack.isEmpty()) stack.pop();
                        break;
                    case ".":
                    case "":
                        break;
                    default:
                        stack.push(dir);
                }
            }
        }

        if (stack.isEmpty()) return "/";

        while (!stack.isEmpty()) {
            answ.insert(0, "/" + stack.pop());
        }

        return answ.toString();
    }
}

