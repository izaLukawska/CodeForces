package CodeForces;

//https://codeforces.com/problemset/problem/4/A

public class CodeForces_4A {
    public static String canDivideInTwoParts(int weight) {
        if (weight < 0 || weight > 100) {
            throw new IllegalArgumentException("Weight must be in the range 1 to 100.");
        }
        return weight % 2 == 0 && weight > 2 ? "YES" : "NO";
    }
}