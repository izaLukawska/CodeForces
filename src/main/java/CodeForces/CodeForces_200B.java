package CodeForces;

import java.util.Arrays;
//https://codeforces.com/problemset/problem/200/B

public class CodeForces_200B {
    public static float orangeJuicePercent(int numberOfDrinks, String volume){
        return Arrays.stream(volume.split(" ")).mapToInt(Integer::parseInt).sum() / (float)numberOfDrinks;
    }
}
