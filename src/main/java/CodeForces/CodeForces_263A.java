package CodeForces;

// https://codeforces.com/problemset/problem/263/A

public class CodeForces_263A {
    public static int movesToMakeMatrix(int rows, int column) {
        return Math.abs(2 - rows) + Math.abs(2 - column);
    }
}