package CodeForces;
//https://codeforces.com/problemset/problem/344/A

public class CodeForces_344A {

    public static int numberOfGroups(int magnets, String pattern) {
        int groupsOfTens = 0;
        int groupsOfOnes = 0;
        String[] tens = pattern.split("01");
        String[] ones = pattern.split("10");
        String[] var6 = tens;
        int var7 = tens.length;
        int var8;
        String one;
        for(var8 = 0; var8 < var7; ++var8) {
            one = var6[var8];
            if (one.contains("10")) {
                ++groupsOfTens;
            }
        }

        var6 = ones;
        var7 = ones.length;

        for(var8 = 0; var8 < var7; ++var8) {
            one = var6[var8];
            if (one.contains("01")) {
                ++groupsOfOnes;
            }
        }

        return groupsOfOnes + groupsOfTens;
    }
}
