
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class MoveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();
            int chars = 0;
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                String word = scanner.nextLine();
                if (chars + word.length() <= m && !flag) {
                    chars += word.length();
                    count++;
                } else {
                    flag = true;
                }
            }
            System.out.println(count);
        }
    }
}




