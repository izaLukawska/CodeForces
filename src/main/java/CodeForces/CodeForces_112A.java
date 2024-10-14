package CodeForces;

//https://codeforces.com/problemset/problem/112/A

public class CodeForces_112A {
    public static int stringComparison(String first, String second) {
        if (first.length() != second.length()) {
            throw new IllegalArgumentException("Strings must be equal");
        }
        return Integer.compare(first.compareToIgnoreCase(second), 0);
    }
}