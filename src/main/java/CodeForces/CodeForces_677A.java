package CodeForces;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

//https://codeforces.com/problemset/problem/677/A

public class CodeForces_677A {

    public static int roadWidth(int numberOfFriends, int fenceHeight) {
        Scanner scanner = new Scanner(System.in);
        Map<Boolean, Long> sum = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.groupingBy((i) -> Integer.parseInt(i) > fenceHeight, Collectors.counting()));
        return sum.get(true).intValue() * 2 + sum.get(false).intValue();
    }
}