package Shape;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeFactory sf=new ShapeFactory();
        sf.getInstance("Circle").setRadius(4);

    }
}
