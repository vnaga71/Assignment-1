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
class Class1 {
    public void display() {
        System.out.println("Class1");
    }
}

class Class2 {
    public void show() {
        System.out.println("Class2");
    }
}

public class multipleClass {
    public static void main(String[] args) {
        System.out.println("MainClass");
        Class1 c=new Class1();
        Class2 c2=new Class2();
        c.display();
        c2.show();
        
        
    }
}

