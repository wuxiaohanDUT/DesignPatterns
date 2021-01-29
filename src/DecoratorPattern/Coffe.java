package DecoratorPattern;

/**
 * 可以被装饰的类
 */
public class Coffe extends Beverage{

    public Coffe(){
        super.description="Coffe";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
