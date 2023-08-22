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
public class conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words = {
            "Zero", "One", "Two", "Three", "Four", 
            "Five", "Six", "Seven", "Eight", "Nine"
        };


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a digit (0-9): ");
        int digit = scanner.nextInt();
        scanner.close();

        if (digit >= 0 && digit <= 9) {
            System.out.println("In words: " + words[digit]);
        } else {
            System.out.println("Invalid digit");
        }
    }
}
        // TODO code application logic here
    }
    
}
