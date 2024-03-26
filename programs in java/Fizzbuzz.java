/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//QUESTION 1 write aprogram that prints the numbers from1 to 100.for multiples of 3 prints fizz for multiples of 5 print buzz and for multiples of both 3 and5 print fizzbuzz
package com.mycompany.fizzbuzz;

/**
 *
 * @author Santana
 */
public class Fizzbuzz {

    public static void main(String[] args) {
        for(int a=1;a<=100;a++){
            if(a%3==0 && a%5==0){
                System.out.println("Fizzbuzz");
            }
            else if(a%3==0){
                System.out.println("Fizz");
            }
            else if(a%5==0){
                System.out.println("buzz");
            }else{
                System.out.println(a);
            }
      
    }
    }
}
