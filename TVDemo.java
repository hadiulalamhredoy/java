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
public class TVDemo {
    public static void main(String[] args) {
        TV samsung = new TV();
        TV bravia = new TV();
        
        bravia.turnOn();
        bravia.setChannel(2);
        bravia.setChannel(3);
        bravia.setVolume(2.5);
        bravia.channelUp();
        bravia.turnOff();
    }           
}
