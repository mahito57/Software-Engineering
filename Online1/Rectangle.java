package Shape;

public class Rectangle extends Shape{

    Rectangle(){
        length=0;
        width=0;
    }



    @Override
    public void area() {
        System.out.println("Area is: "+length*width);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is: "+2*length*width);
    }
}
