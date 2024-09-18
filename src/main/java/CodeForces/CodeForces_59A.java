package CodeForces;

//https://codeforces.com/problemset/problem/59/A

public class CodeForces_59A {
    public static String correctedWord(String word){
        int upperCaseLettersCount = 0;
        int lowerCaseLettersCount = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(i)){
                upperCaseLettersCount++;
            } else {
                lowerCaseLettersCount++;
            }
        }
        return upperCaseLettersCount > lowerCaseLettersCount ? word.toUpperCase() : word.toLowerCase();
    }
}