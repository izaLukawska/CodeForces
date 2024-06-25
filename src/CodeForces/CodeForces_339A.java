package CodeForces;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://codeforces.com/problemset/problem/339/A

public class CodeForces_339A {
    public static String sum(String s) {
        if (s.length() > 100) {
            throw new IllegalArgumentException("String is max. 100 characters long");
        }
        return Arrays.stream(s.split("\\+")).sorted().collect(Collectors.joining("+"));
    }
}
