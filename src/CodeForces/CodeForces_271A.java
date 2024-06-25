package CodeForces;
//https://codeforces.com/problemset/problem/271/A
public class CodeForces_271A {

    public static int nextDistinctYear(int distinctYear) {
        if (distinctYear >= 1000 && distinctYear <= 9000) {
            ++distinctYear;

            while(String.valueOf(distinctYear).charAt(3) == String.valueOf(distinctYear).charAt(2) || String.valueOf(distinctYear).charAt(3) == String.valueOf(distinctYear).charAt(1) || String.valueOf(distinctYear).charAt(3) == String.valueOf(distinctYear).charAt(0) || String.valueOf(distinctYear).charAt(2) == String.valueOf(distinctYear).charAt(1) || String.valueOf(distinctYear).charAt(1) == String.valueOf(distinctYear).charAt(0)) {
                ++distinctYear;
            }

            return distinctYear;
        } else {
            throw new IllegalArgumentException("Year must be in the range 1000 to 9000");
        }
    }
}
