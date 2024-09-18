package CodeForces;

//https://codeforces.com/problemset/problem/977/A

public class CodeForces_977A {

    public static int result(int number, int subtractionCount) {
        if (2 > number || number > Math.pow(10, 9) || subtractionCount < 1 || subtractionCount > 50) {
            throw new IllegalArgumentException("Number must be in the range 2 and 10^9, and subtraction count 1 to 50");
        }
        for (int i = 0; i < subtractionCount; i++) {
            if (number % 10 != 0) {
                number--;
            } else {
                number = number / 10;
            }
        }
        return number;
    }
}