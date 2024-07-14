package Shape;

public class Square extends Shape{

    Square(){
        length=0;
    }
    Square(int length){
        this.length=length;
    }

    @Override
    public void area() {
        System.out.println("Area is: "+length*length);
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter is: "+ 4*length);
    }
}
