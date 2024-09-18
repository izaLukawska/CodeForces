package CodeForces;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://codeforces.com/problemset/problem/734/A

public class CodeForces_734A {

    public static String winner(int games, String winner) {
        if (games < 1 || games > 100_000 || winner.length() != games) {
            throw new IllegalArgumentException("Number of games must be in the range 1 to 100 000");
        }
        return Arrays.stream(winner.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(entry ->
                {
                    if (entry.getKey().equals("A")) {
                        return "Anton";
                    } else {
                        return "Danik";
                    }
                }).orElse("Friendship");
    }
}