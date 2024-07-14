package Shape;

public class Circle extends Shape {

    Circle(){
        radius=0;
    }
    Circle(int r){
        radius=r;
    }

    @Override
    public void area() {
        System.out.println("Area is: "+ radius*radius*3.1416);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is: "+ 2*radius*3.1416);
    }
}
