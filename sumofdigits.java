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
public class sumofdigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result=0;
		for(int i=100;i<=200;i++){
			if(i%7==0)
				result+=i;
		}
		System.out.println("Output of Program is : "+result);
	}
}
        // TODO code application logic here
    }
    
}
