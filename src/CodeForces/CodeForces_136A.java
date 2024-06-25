package CodeForces;

import java.util.Arrays;
import java.util.List;

//https://codeforces.com/problemset/problem/136/A

public class CodeForces_136A {
    public static void receivedGiftFrom(int friendsCount, String gaveGiftTo){
        if(friendsCount < 0 || friendsCount > 100){
            throw new IllegalArgumentException("Number must be in the range 1 to 100");
        }

        List<String> giftGiven = Arrays.stream(gaveGiftTo.split(" ")).toList();
        for(int i = 1; i <= giftGiven.size(); i++){
            System.out.println(giftGiven.indexOf(String.valueOf(i)) +1);
        }
    }
}
