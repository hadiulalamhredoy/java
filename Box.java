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
public class Box {
    double length;
    double height;
    double width;
    
    Box(double hei, double wid, double len){//Constructor
        length = len;
        height = hei;
        width = wid;
    }
    
    void volume(){
        System.out.println("Volume is: "+ length*width*height);
    }
}
