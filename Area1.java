package method_overriding;

public class Area1 {
    public double area(double a, double b) {
        double c = a * b;
        return c;
    }

}



public class Main {

    public static void main(String args[]){

        Area2 numObj = new Area2();

        System.out.println("Perimeter of rectangle is "+ numObj.area(2,3));
    }
}
