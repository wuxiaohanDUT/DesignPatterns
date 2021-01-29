package DecoratorPattern;

/**
 * 装饰者实现类 糖
 */
public class Sugar extends CondimentDecorator{

    private Beverage beverage;

    public Sugar(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost()+0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Sugar";
    }
}
