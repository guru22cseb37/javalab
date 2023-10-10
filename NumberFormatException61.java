/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaex6;
import java.util.*;
public class NumberFormatException61  
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        String str1,str2;      
        int a,b;
        try
        {
            System.out.print("\nEnter the value of A: ");
            str1=obj.next();
            System.out.print("Enter the value of B: ");
            str2=obj.next();
            a=Integer.parseInt(str1);
            b=Integer.parseInt(str2);
            System.out.println("\nThe value of A is "+a+" and B is "+b);
        }
        catch(NumberFormatException e)
        {
            System.out.println("\n"+e);
        }
    }
}
