/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author imran
 */
public class ExceptionThrow {
    public static void f() {
        try {
            throw new NullPointerException("This is my custom generated exception");
        } catch (Exception e) {
            System.out.println("Inside catch of f()");
            throw e; //rethrow the exception
        }
    }
    
    public static void main(String[] args) {
        try{
            f();
        }catch(NullPointerException e){
            System.out.println("Inside driver function exception or try block");
        }
    }
   
}
