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
public class TypeConversions {
    public static void main(String[] args) {
        float floatValue = 10.5f;
        int intValue = (int) floatValue;
        System.out.println("float to int: " + intValue);
        double doubleValue = 20.75;
        float floatValue2 = (float) doubleValue;
        System.out.println("double to float: " + floatValue2);
        int intValue2 = 1000;
        short shortValue = (short) intValue2;
        System.out.println("int to short: " + shortValue);
    }
}
