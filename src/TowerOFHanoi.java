

import java.util.Scanner;

public class TowerOFHanoi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        solveTowerOfHanoi(N, "T1", "T2", "T3");

        int totalSteps = calculateTotalSteps(N);
        System.out.println(totalSteps);
    }

    public static void solveTowerOfHanoi(int N, String source, String destination, String auxillary) {
        if (N == 1) {
            System.out.println("Move 1th disc from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(N - 1, source, auxillary, destination);
        System.out.println("Move " + N + "th disc from " + source + " to " + destination);
        solveTowerOfHanoi(N - 1, auxillary, destination, source);
    }

    public static int calculateTotalSteps(int N) {
        if (N == 1) {
            return 1;
        }

        return 2 * calculateTotalSteps(N -1)+1;
}
}

