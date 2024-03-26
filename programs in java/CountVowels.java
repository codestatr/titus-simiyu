/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//question 6 write a program that counts the number of vowels in a sentence 

package com.mycompany.countvowels;

/**
 *
 * @author Santana
 */
import java.util.Scanner;
public class CountVowels {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("enter the paragraph");
        String paragraph=scanner.nextLine();
        int vowelcount=countVowels(paragraph);
        System.out.println("number of vowels are:"+vowelcount);
    }
    public static int countVowels(String str){
        int count=0;
        str=str.toLowerCase();
        for(int y=0;y<str.length();y++){
            char ch=str.charAt(y);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
        
    }
}
