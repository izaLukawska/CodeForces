package CodeForces;

public class CodeForces_1030A {
    public static String problemHardship(int peopleCount, String answer) {
        if(peopleCount < 1 || peopleCount > 50){
            throw new IllegalArgumentException("Wrong input");
        }
        return answer.contains("1") ? "HARD" : "EASY";
    }
}