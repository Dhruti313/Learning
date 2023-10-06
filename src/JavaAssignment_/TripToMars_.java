package JavaAssignment_;

import java.util.Scanner;

public class TripToMars_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the X-axis::");
        int x = s.nextInt();
        System.out.println("Enter the Y-axis::");
        int y = s.nextInt();

        System.out.println("Enter teh Co-ordinate of X & Y::");
        int xc = s.nextInt();
        int yc = s.nextInt();

        System.out.println("Enter the Direction::");
        char dir = s.next().charAt(0);

        String move = s.next();

        int fwd = move.length();
        int xf = 0, yf = 0;

        if (dir == 'N') {
            if (yc - fwd >= 0) {
                xf = xc;
                yf = yc - fwd;
            } else {
                System.out.println("OUT OF BOUNDARY...");
            }
        }
        if (dir == 'S') {
            if (yc + fwd <= y) {
                xf = xc;
                yf = yc + fwd;
            } else {
                System.out.println("OUT OF BOUNDARY...");
            }
        }
        if (dir == 'E') {
            if (xc + fwd < x) {
                yf = yc;
                xf = xc + fwd;
            } else {
                System.out.println("OUT OF BOUNDARY...");
            }
        }
        if (dir == 'W') {
            if (xc - fwd >= 0) {
                yf = yc;
                xf = xc - fwd;
            } else {
                System.out.println("OUT OF BOUNDARY ..");
            }
        }
        System.out.println(xf + " " + yf + " " + dir);

    }
}
