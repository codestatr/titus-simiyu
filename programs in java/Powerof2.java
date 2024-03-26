/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//question3 write a program that taes an integer as an input and returns true if the input is a powr of two 

package com.mycompany.powerof2;

/**
 *
 * @author Santana
 */
import java.util.Scanner;
public class Powerof2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("input integer:");
        int num=scanner.nextInt();
        boolean isPowerof2=(num>0)&&((num&(num-1))==0);
        System.out.println("is the number power of 2:"+isPowerof2);
    }
    
        }
            
        
    


        
    


