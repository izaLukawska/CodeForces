package CodeForces;

import java.util.Arrays;

//https://codeforces.com/problemset/problem/110/A

public class CodeForces_110A {
    public static String nearlyLuckNumber(long number){
        if(number < 1 || number > Math.pow(10, 18)){
            throw new IllegalArgumentException("Number must be in the range 1 to 10^18.");
        }
        long count = Arrays.stream(String.valueOf(number).split("")).mapToInt(Integer::parseInt)
                .filter(i -> i == 4 || i == 7).count();
        return count == 4 || count == 7 ? "YES" : "NO";
    }
}
