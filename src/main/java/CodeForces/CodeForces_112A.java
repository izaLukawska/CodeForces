package CodeForces;

//https://codeforces.com/problemset/problem/112/A

public class CodeForces_112A {
    public static int stringComparison(String one, String two) {
        if (one.length() != two.length()) {
            throw new IllegalArgumentException("Strings must be equal");
        }
        return Integer.compare(one.compareToIgnoreCase(two), 0);
    }
}