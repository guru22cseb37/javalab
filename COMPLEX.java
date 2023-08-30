/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author test02
 */
public class COMPLEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            operation obj=new operation();
       obj.add(10, 20);
       obj.sub(20, 10);
       obj.mul(2, 4);
       obj.mod(10, 20);
       
    }
   
}
class operation
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void sub(int a,int b)
    {
        System.out.println(a-b);
    }
    public void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    public void mod(int a,int b)
    {
        System.out.println(a%b);
    }
}
      
        
    
           
    