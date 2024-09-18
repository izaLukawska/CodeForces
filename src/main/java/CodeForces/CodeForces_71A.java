package CodeForces;

// https://codeforces.com/problemset/problem/71/A
public class CodeForces_71A {
    public static String abbreviations(String word) {
        if (word.length() > 100) {
            throw new IllegalArgumentException("No such word exists.");
        }
        StringBuilder sb = new StringBuilder(word);
        return word.length() > 10 ? sb.replace(1, word.length() - 1, String.valueOf(word.length() - 2)).toString() : word;
    }
}