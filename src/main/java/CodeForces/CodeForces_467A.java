package CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/467/A

public class CodeForces_467A {

    public static int roomsAvailable(int roomsTotal) {
        if(roomsTotal < 1 || roomsTotal > 100){
            throw new IllegalArgumentException("Rooms must be in range 1 to 100");
        }
        int friendsCount = 2;
        int roomsAvailable = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < roomsTotal; i++) {
            if (scanner.nextInt() + friendsCount <= scanner.nextInt()) {
                roomsAvailable++;
            }
        }
        return roomsAvailable;
    }
}