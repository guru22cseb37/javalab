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
public class ArrayIndexOutOfBoundsException61 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n,key;
        int arr[];
        try
        {
            System.out.print("\nEnter the no. of elements of the array: ");
            n=obj.nextInt();
            arr=new int[n];
            System.out.println("");
            for(int i=0;i<n;i++)
            {
                System.out.print("Enter arr["+i+"]= ");
                arr[i]=obj.nextInt();
               
            }
            System.out.print("\nEnter the index value of the position you need to access: ");
            key=obj.nextInt();
            System.out.println("\nThe value at index "+key+" is: "+arr[key]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\n"+e);
        }
    }    
}
