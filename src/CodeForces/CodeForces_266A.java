package CodeForces;

import java.util.LinkedList;

//https://codeforces.com/problemset/problem/266/A

public class CodeForces_266A {
    public static int numberOfStonesRemoved(int numberOfStones, String colors) {
        LinkedList<String> listOfColors = new LinkedList<>();
        for (int i = 0; i < colors.length() - 1; i++) {
            if (colors.charAt(i) != colors.charAt(i + 1)) {
                listOfColors.add(String.valueOf(colors.charAt(i)));
            }
        }
        if (colors.charAt(colors.length() - 1) == colors.charAt(colors.length() - 2)) {
            listOfColors.add(String.valueOf(colors.charAt(colors.length() - 1)));
        }
        return colors.length() - listOfColors.size();
    }
}
