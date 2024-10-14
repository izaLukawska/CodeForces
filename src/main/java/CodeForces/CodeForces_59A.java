package CodeForces;

//https://codeforces.com/problemset/problem/59/A

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CodeForces_59A {
    public static String correctedWord(String word){
        if(word == null){
            throw new NullPointerException("Word can't be null.");
        }
        Map<Boolean, Long> collect = Arrays.stream(word.split("")).collect(Collectors.groupingBy((i -> i.equals(i.toUpperCase()))
                ,Collectors.counting()));
        return collect.get(true) > collect.get(false) ? word.toUpperCase() : word.toLowerCase();
    }
}