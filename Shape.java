package abstract_pkg;

public abstract class Shape {
    public abstract void area();
    //this is an abstract method, it doesn;t have implementation
}

//abstract means that we only know the overview but not the details
//abstarct class may have completed method itself as well as abstract mathos also
// this is a abstract class; abstract class may or may not have abstarct method

public class Rectangle extends Shape{
    //implements the area() shape class
    public void area(){

        int l =5, b=4;
        int z = l*b;
        System.out.println("Area of a rectangle is: "+ z);
    }
}

public class Circle extends Shape {
    //implements the area() of shape class

    public void area(){
        double pi = 3.14;
        int r = 2;
        double area = pi* r*r;//also an exmaple of method override
        System.out.println("The area of the rectangle is: "+ area);
    }
}
public class Main{
    public static void main(String []args){
    
            Rectangle rec = new Rectangle();
            Circle cic = new Curcle();
            rec.area();
            cic.area();
    }
}
