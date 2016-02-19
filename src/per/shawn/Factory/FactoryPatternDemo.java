package per.shawn.Factory;

/**
 * Created by 594829 on 2016/2/19.
 */
public class FactoryPatternDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}
