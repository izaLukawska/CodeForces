package CodeForces;

import java.util.Arrays;

// https://codeforces.com/problemset/problem/236/A

public class CodeForces_236A {
    public static String sexPrediction(String username) {
        return Arrays.stream(username.split("")).distinct().count() % 2 == 0 ? "CHAT WITH HER" : "IGNORE HIM";
    }
}