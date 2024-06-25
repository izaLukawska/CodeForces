package CodeForces;

//https://codeforces.com/problemset/problem/486/A

public class CodeForces_486A {
    public static long functionResult(long number) {
        if (number >= 1L && !((double)number > Math.pow(10.0, 15.0))) {
            return number % 2L == 0L ? number / 2L : -(number / 2L + 1L);
        } else {
            throw new IllegalArgumentException("Number too big");
        }
    }
}
