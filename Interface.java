When there are two abstract classes, and we want to extend those two abstract class we do this way:
class C extends A,B{}
But Java does not support multiple inheritance, so that's why we need INTERFACE. 

Interface are always declared using interface keyword.
public interface interface_demo{
//final,static fields
//abstract methods
}

Interface are themselves abstract, so it is not necessary to write abstract when declaring interface. 

package interface_demo;
public interface Calculate{
  public void add();//no retirn type, overhere ;means only declaring it not defining it.Method which is declared is of no use,
                    we want method definition
   int multiply (int a, int b); 
}

package interface_demo;

public class Sum implements Calculate{
  public void add(){
    int x= 10;
    int y=15;
    int z = x+y;
    System.out.println("Sum is : " + z);
  }
  public int multiply(int a, int b){
    System.out.println("Multiplication is : " + (a+b));
  }

}
package interface_demo;

public class Main{
  public static void main(String [] args){
    Sum num = new Sum();
    num.add();
    num.multiply(5,3);
  }

}
