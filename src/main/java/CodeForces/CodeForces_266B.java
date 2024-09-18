package CodeForces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://codeforces.com/problemset/problem/266/B

public class CodeForces_266B {

    public static String queue(int kids, int seconds, String sex) {
        if (kids < 1 && kids > seconds) {
            throw new IllegalArgumentException("Kids number must be bigger than 1 and less than seconds count");
        }
        if (seconds > 50 && seconds < kids) {
            throw new IllegalArgumentException("Seconds count must be bigger than kids number but less than 50");
        }
        List<String> list = Arrays.stream(sex.split("")).collect(Collectors.toList());
        for (int j = 0; j < seconds; ++j) {
            for (int i = list.size() - 1; i > 0; --i) {
                if (list.get(i).equals("G") && list.get(i - 1).equals("B")) {
                    list.set(i, "B");
                    list.set(i - 1, "G");
                }
            }
        }
        return String.join("", list);
    }
}