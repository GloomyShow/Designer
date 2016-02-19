package per.shawn.Factory;

/**
 * Created by 594829 on 2016/2/19.
 * 形状接口实现类
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
