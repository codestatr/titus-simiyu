/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//question5 write a programm that takes an integer as an input and returns an integer with revesed ordering
package com.mycompany.reverseinteger;

/**
 *
 * @author Santana
 * 
 */
import java.util.Scanner;
public class ReverseInteger {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        
        System.out.println("enter integer:");
        int num=scanner.nextInt();
        int reversednum=ReverseInteger(num);
        System.out.println("Reversed num:"+reversednum);
    }
    public static int ReverseInteger(int num){
        int reversed=0;
        while(num !=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        return reversed;
    }
}
