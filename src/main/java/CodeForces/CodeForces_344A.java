package CodeForces;

//https://codeforces.com/problemset/problem/344/A

import java.util.Scanner;

public class CodeForces_344A {

    public static int numberOfGroups(int magnets) {
        Scanner scanner = new Scanner(System.in);
        int[] magnetsArray = new int[magnets];
        int groupCount = 1;
        for (int i = 0; i < magnetsArray.length; i++) {
            magnetsArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < magnetsArray.length - 1; i++) {
            if (magnetsArray[i] != magnetsArray[i + 1]) {
                groupCount++;
            }
        }
        return groupCount;
    }
}