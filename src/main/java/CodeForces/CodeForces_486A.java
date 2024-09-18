package CodeForces;

//https://codeforces.com/problemset/problem/486/A

public class CodeForces_486A {
    public static long functionResult(long number) {
        if(number <1 || number > Math.pow(10.0, 15.0)){
            throw new IllegalArgumentException("Number too big or too small");
        }
        return number % 2L == 0L ? number / 2L : -(number / 2L + 1L);
    }
}