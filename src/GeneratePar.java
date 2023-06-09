import java.util.*;
public class GeneratePar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        genParen( 0, 0, n,"");

    }

    public static void genParen(   int open, int close,int n,String curr) {
        if (open == n && close == n) {
            System.out.println(curr);
        } else {
            if (open > close)
                genParen(open, close + 1, n, curr + ')');
            if (open < n)
                genParen(open + 1, close, n, curr + '(');
       }
}


}

