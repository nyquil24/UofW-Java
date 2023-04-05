package org.example.conditionals_and_loops;

public class onePuntathree {
    public static void main(String[] args) {
        int n = 6;
        int power = 1;
        int i = 0;
        while (i <= n) {
            System.out.println(i + " " + power);
            power = 2 * power;
            i = i + 1;
        }
    }
}
