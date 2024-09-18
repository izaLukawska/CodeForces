package CodeForces;

//https://codeforces.com/problemset/problem/50/A

public class CodeForces_50A {
    public static int dominoCount(int width, int length) {
        if (!(1 <= width && width <= length && length <= 16)) {
            throw new IllegalArgumentException("The range is: 1 <= width <= length <= 16");
        }
        return (width * length) / 2;
    }
}