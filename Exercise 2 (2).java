package javaapplication4;
import java.util.*;
public class complex
{
  int real, img;
 public complex (int r, int i)
  {
    this.real = r;
    this.img = i;
  }
 public void show(){
    System.out.println(this.real+"+"+"("+this.img+"i"+")");
}
 public static complex add(complex c1,complex c2){
       complex a = new complex(0,0);
       a.real = c1.real+c2.real;
       a.img = c1.img+c2.img;
       return a;
    }  public static complex multiply(complex c1,complex c2){
       complex m = new complex(0,0);
       m.real = c1.real*c2.real;
       m.img = c1.img*c2.img;
       return m;
      }
  public static complex sub(complex c1,complex c2){
       complex s = new complex(0,0);
       s.real = c1.real-c2.real;
       s.img = c1.img-c2.img;
       return s;
     }
   public static complex div(complex c1,complex c2){
       complex d = new complex(0,0);
       d.real = c1.real/c2.real;
       d.img = c1.img/c2.img;
       return d;
     }
  public static void main (String[] args)
  {
    Scanner obj = new Scanner (System.in);
    System.out.println ("enter real and img part");
    int n1 = obj.nextInt ();
    int n2 = obj.nextInt ();
    System.out.println ("enter real and img part");
    int m1 = obj.nextInt ();
    int m2 = obj.nextInt ();
    complex c1 = new complex(n1,n2);
    complex c2 = new complex(m1,m2);
    complex a = add(c1,c2);
    System.out.print("Addition  ");
    a.show();
    complex m = multiply(c1,c2);
    System.out.print("multiplication  ");
    m.show();
    complex s = sub(c1,c2);
    System.out.print("subraction  ");
    s.show();
    complex d = div(c1,c2);
    System.out.print("division  ");
    d.show();
   }
}