package CodeForces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/116/A

public class CodeForces_116A {

    public static int minCapacity(int tramStops) {
        if (tramStops >= 2 && tramStops <= 1000) {
            Scanner scanner = new Scanner(System.in);
            int currentCapacity = 0;
            int minCapacity = 0;

            for(int i = 0; i < tramStops; ++i) {
                int pplOut = scanner.nextInt();
                int pplIn = scanner.nextInt();
                currentCapacity -= pplOut;
                currentCapacity += pplIn;
                if (currentCapacity > minCapacity) {
                    minCapacity = currentCapacity;
                }
            }

            return minCapacity;
        } else {
            throw new IllegalArgumentException("Tramstops must be in the range 2 to 1000");
        }
    }
}
