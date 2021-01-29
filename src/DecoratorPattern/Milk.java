package DecoratorPattern;


/**
 * 可以被装饰的类
 */
public class Milk extends Beverage{

    public Milk(){
        super.description="Milk";
    }
    @Override
    public double getCost() {
        return 4.0;
    }
}
