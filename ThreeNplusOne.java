/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ThreeNplusOne {

    public static int cycle(long n) {
        System.out.println("\n_____\n");
        int count = 1;
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + " ");
            } else {
                n = (n * 3) + 1;
                System.out.print(n + " ");
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        int ans = 0, i, j, n = -1;

        while (n == -1) {
            i = si.nextInt();
            j = si.nextInt();

            for (int a = Math.min(i, j); a <= Math.max(i, j); a++) {
                ans = Math.max(cycle(a), ans);
            }
            System.out.println("\nMaximum Cycle length is: " + ans);
            
            System.out.println("Do you want to continue?"
                    + " If yes then input -1 or input 0 for n ");
            n = si.nextInt();
        }
        /* For printing without i and j
        System.out.println("\nCycle length is: " + cycle(n));
         */
        
    }
}
