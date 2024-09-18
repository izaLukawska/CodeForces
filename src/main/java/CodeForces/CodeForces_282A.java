package CodeForces;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/282/A

public class CodeForces_282A {
    public static int finalValue(int numberOfStatements) {
        int finalValue = 0;
        for (int i = 1; i <= numberOfStatements; i++) {
            Scanner scanner = new Scanner(System.in);
            String operation = scanner.nextLine();
            if (operation.equals("++x") || operation.equals("x++")) {
                finalValue++;
            } else if (operation.equals("--x") || operation.equals("x--")) {
                finalValue--;
            } else {
                throw new IllegalArgumentException("Operation must be in form ++x or --x");
            }
        }
        return finalValue;
    }
}