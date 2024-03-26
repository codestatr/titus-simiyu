/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//question4write a program that accepts string as input, capitalises the first letter of each word in the string and then retuns the resultt string
package com.mycompany.capitalizewords;

/**
 *
 * @author Santana
 */
import java.util.Scanner;
public class CapitalizeWords {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the word");
        String inputString=scanner.nextLine();
        String resultString=CapitalizeWords(inputString);
        System.out.println("CapitalizeWords:"+resultString);
    }
    public static String CapitalizeWords(String str){
        if(str==null||str.isEmpty()){
            return str;
            
        }
        StringBuilder capitalizedStr=new StringBuilder();
        String[]words=str.split("\\s+");
        for(String word:words){ 
            String CapitalizeWords=word.substring(0).toUpperCase()+word.substring(1).toLowerCase();
            capitalizedStr.append(CapitalizeWords);
        }
        return
                capitalizedStr.toString();
    
        }
        
        
        
    
}
