package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://codeforces.com/problemset/problem/136/A

public class CodeForces_136A {
    public static List<Integer> receivedGiftFrom(int friendsCount, String gaveGiftTo) {
        if (friendsCount < 1 || friendsCount > 100) {
            throw new IllegalArgumentException("Number must be in the range 1 to 100");
        }
        if (gaveGiftTo == null){
            throw new NullPointerException();
        }
        List<Integer> giftGiven = Arrays.stream(gaveGiftTo.split(" ")).mapToInt(Integer::parseInt).boxed().toList();
        List<Integer> giftReceived = new ArrayList<>();
        for (int i = 1; i <= giftGiven.size(); i++) {
            giftReceived.add(giftGiven.indexOf(i) + 1);
        }
        return giftReceived;
    }
}