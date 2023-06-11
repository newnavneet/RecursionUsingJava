

import java.util.Scanner;

public class SplitArray {
    static int count = 0;

    public static void main(String[] args) {
        count = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        disp(0, "", 0, "", 0, arr);
        System.out.println(count);
    }

    public static void disp(int i, String str1, int sum1, String str2, int sum2, int[] arr) {
        if (i == arr.length) {
            if (sum1 == sum2) {
                System.out.println(str1 + "and " + str2);
                count++;
            }
            return;
        }
        disp(i+1, str1 + arr[i] + " ", sum1 + arr[i], str2, sum2, arr);
        disp(i+1, str1, sum1, str2+arr[i] + " ", sum2+arr[i],arr);
}
}

