/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5.opertionjava;

import java.util.Scanner;

/**
 *
 * @author test02
 */
public class operationjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, smallest;  
Scanner sc  = new Scanner(System.in);    
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
if(a<b){
    System.out.print("Minimum is " + a);
}
else
{
    System.out.println("Minimun is " + b);
}
        // TODO code application logic here
    }
    
}
