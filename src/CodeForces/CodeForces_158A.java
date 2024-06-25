package CodeForces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/158/A

public class CodeForces_158A {
    public static int advanceNumber(int participants, int kPlaceScore) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < participants; i++) {
            scores.add(scanner.nextInt());
        }
        List<Integer> descending_scores = scores.stream().sorted(Comparator.reverseOrder()).toList();
        if (!scores.equals(descending_scores)) {
            throw new IllegalArgumentException("Scores must be in decreasing order");
        }
        return (int) scores.stream().filter(score -> score >= scores.get(kPlaceScore) && score != 0).count();
    }
}
