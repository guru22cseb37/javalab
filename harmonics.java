/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5.opertionjava;

/**
 *
 * @author test02
 */
public class harmonics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num = 5;
        double result = 0.0;
 
        System.out.println("The harmonic series is: ");
        while (num > 0) {
            result = result + (double)1 / num;
            num--;
            System.out.print(result + ", ");
        }
    }
}
        // TODO code application logic here
    }
    
}
