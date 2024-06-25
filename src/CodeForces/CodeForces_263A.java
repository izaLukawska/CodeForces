package CodeForces;

import java.util.HashSet;
import java.util.Set;

// https://codeforces.com/problemset/problem/236/A

public class CodeForces_263A {
    public static String sexPrediction(String username) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < username.length(); i++) {
            result.add(String.valueOf(username.charAt(i)));
        }
        return result.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!";
    }
}
