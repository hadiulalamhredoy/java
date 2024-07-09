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
public class TV {
    boolean on = false;
    int channel = 1;
    double volumeLevel = 1.5;

    TV(){
        System.out.println("TV is created");
    }

    void turnOn() {
        on = true;
        System.out.println("Turned on");
    }

    void turnOff() {
        on = false;
        System.out.println("Turned off");
    }

    void setChannel(int newChannel) {
        if (on && channel >= 1 && channel <= 120) {
            channel = newChannel;
        }
    }

    void setVolume(double newVolumeLevel) {
        if (on && volumeLevel >= 1.5 && volumeLevel <= 120) {
            volumeLevel = newVolumeLevel;
        }
    }

    void channelUp() {
        if (on && channel > 1) {
            channel++;
        }
    }

    void channelDown() {
        if (on && channel < 120) {
            channel--;
        }
    }

    void volumeUp() {
        if (on && volumeLevel > 1.5) {
            volumeLevel++;
        }
    }

    void volumeDown() {
        if (on && volumeLevel < 7) {
            volumeLevel--;
        }
    }
}
