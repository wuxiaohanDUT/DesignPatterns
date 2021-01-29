package DecoratorPattern;


/**
 * 饮料装饰者抽象类
 */
public abstract class CondimentDecorator extends Beverage{

    protected Beverage beverage;

    public abstract String getDescription();
}
