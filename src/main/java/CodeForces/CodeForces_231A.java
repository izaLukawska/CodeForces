package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/231/A

public class CodeForces_231A {
    public static int numberOfSolution(int problems) {
        int sum = 0;
        if (problems < 0 || problems > 1000) {
            throw new IndexOutOfBoundsException("Choose number of problems between 1 to 1000.");
        }
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < problems; i++) {
            if (Arrays.stream(scanner.nextLine().split(" ")).filter(value -> Integer.parseInt(value) == 1).count() > 1) {
                sum++;
            }
        }
        return sum;
    }
}