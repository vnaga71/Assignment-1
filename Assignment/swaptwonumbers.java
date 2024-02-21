/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author venka
 */
public class swaptwonumbers {

    public static void main(String args[]) {

        int x = 100, y = 200;
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
