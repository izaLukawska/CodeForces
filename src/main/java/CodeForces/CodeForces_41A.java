package CodeForces;

//https://codeforces.com/problemset/problem/41/A

public class CodeForces_41A {

    public static String correctTranslation(String berlandishWord, String birlandishWord){
        if(birlandishWord.length() > 100 || berlandishWord.length() > 100 || berlandishWord.isEmpty() || birlandishWord.isEmpty()){
            throw new IllegalArgumentException("Words length need to be less than 100");
        }
        return new StringBuilder(berlandishWord).reverse().toString().equals(birlandishWord) ? "YES" : "NO";
    }
}