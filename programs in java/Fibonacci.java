/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//question2 write a program to generate the fibonacci sequence upto 100
package com.mycompany.fibonacci;

/**
 *
 * @author Santana
 */
public class Fibonacci {

    public static void main(String[] args) {
        int y=20;
        int firstNum=0;
        int secondNum=1;
        System.out.println("Fibonacci up to"+y+"terms");
        for(int a=1;a<=y;++a){
        System.out.println(firstNum+",");
        int nextTerm=firstNum+secondNum;
        firstNum=secondNum;
        secondNum=nextTerm;
    }
}
}
