package CodeForces;

//https://codeforces.com/problemset/problem/281/A

public class CodeForces_281A {
    public static String capitalization(String word) {
        if (word.length() > Math.pow(10, 3)) {
            throw new IllegalArgumentException("Word is too long.");
        }
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.replace(0, 1, String.valueOf(stringBuilder.charAt(0)).toUpperCase());
        return stringBuilder.toString();
    }
}
