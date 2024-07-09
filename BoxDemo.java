/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Student
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(20, 15, 10);
      
        Box b2 = new Box(25, 5, 8);
  
        System.out.println(b1);
        System.out.println(b2);
        b1.volume();
        b2.volume();
    }
}
