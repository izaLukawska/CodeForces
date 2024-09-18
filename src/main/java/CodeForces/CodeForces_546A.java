package CodeForces;

import java.util.ArrayList;
import java.util.List;

//https://codeforces.com/problemset/problem/546/A

public class CodeForces_546A {

    public static int moneyBorrowed(int prize, int dollars, int bananasCount) { // k w n
        if (prize < 1 || prize > dollars || dollars > 1000 || bananasCount < 0 || bananasCount > Math.pow(10, 9)) {
            throw new IllegalArgumentException("Wrong input");
        }
        List<Integer> bananas = new ArrayList<>();
        for (int i = 1; i <= bananasCount; i++) {
            bananas.add(i * prize);
        }
        return (-1) * Math.min((dollars - bananas.stream().mapToInt(Integer::intValue).sum()), 0);
    }
}