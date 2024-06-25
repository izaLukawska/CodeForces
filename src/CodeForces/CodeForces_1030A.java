package CodeForces;
//https://codeforces.com/problemset/problem/1030/A
public class CodeForces_1030A {

    public static String problemHardship(int peopleCount, String answer) {
        if (peopleCount >= 1 && peopleCount <= 50) {
            if (peopleCount != answer.length()) {
                throw new IllegalArgumentException("Wrong input");
            } else {
                return answer.contains("0") ? "EASY" : "HARD";
            }
        } else {
            throw new IllegalArgumentException("People must be in the range 1 to 50");
        }
    }
}
