package method_overriding;

public class Area2 extends Area1 {

    public double area(double a, double b){

        //@Override // check sif method in base -class is overriding by method in sub class
        double  c= 2*(a+b);
        System.out.println("Area of rectangle : "+ super.area(a,b));
        //super will always call from parent class (Area1)

        return c;
    }
}
