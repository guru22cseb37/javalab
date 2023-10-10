/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaex6;
import java.util.*;
/**
 *
 * @author VISHWA
 */
public class ArithmeticException61
{
public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int a,b;
        try
        {
            System.out.print("\nEnter the value of A: ");
            a=obj.nextInt();
            System.out.print("Enter the value of B: ");
            b=obj.nextInt();
            int div=a/b;
            System.out.println("\nThe Division of "+a+" and "+b+" is: "+div);
        }
        catch(ArithmeticException e)
        {
            System.out.println("\n"+e);
        }
    }
}
