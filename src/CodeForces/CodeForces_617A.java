package CodeForces;
// https://codeforces.com/problemset/problem/617/A
public class CodeForces_617A {
    public static int stepsTaken(int houseNumber) {
        if (houseNumber < 1 || houseNumber > 1_000_000) {
            throw new IllegalArgumentException("Number must be in the range 1 to 1 mln");
        }
        return Math.ceilDiv(houseNumber, 5);
    }
}
