

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = format(str, "", ' ');
        System.out.println(newStr);
    }

    public static String format(String str, String p, char ch) {
        if (str.length() == 0) {
            return p;
        }

        if (ch != str.charAt(0)) {
            return format(str.substring(1), p + str.charAt(0), str.charAt(0));
        } else {
            return format(str.substring(1), p + "*" + str.charAt(0), str.charAt(0));
        }
    }
}

