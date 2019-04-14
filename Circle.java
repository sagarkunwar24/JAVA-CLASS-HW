package abstract_pkg;

public class Circle extends Shape {
    //implements the area() of shape class

    public void area(){
        double pi = 3.14;
        int r = 2;
        double area = pi* r*r;//also an exmaple of method override
        System.out.println("The area of the rectangle is: "+ area);
    }
}
