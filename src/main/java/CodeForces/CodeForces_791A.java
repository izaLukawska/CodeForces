package CodeForces;

//https://codeforces.com/problemset/problem/791/A

public class CodeForces_791A {
    public static int yearsNeededToOutgrowBrother(int limakWeight, int bobWeight) {
        if (limakWeight < 1 && limakWeight > bobWeight || bobWeight > 10) {
            throw new IllegalArgumentException("Limak must be heavier than 1 and less than Bob. Bob must be less than 10");
        }
        int years = 0;
        while (limakWeight <= bobWeight) {
            limakWeight = limakWeight * 3;
            bobWeight = bobWeight * 2;
            years++;
        }
        return years;
    }
}