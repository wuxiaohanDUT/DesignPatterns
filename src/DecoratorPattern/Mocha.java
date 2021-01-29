package DecoratorPattern;


/**
 * 装饰者实现类 摩卡
 */
public class Mocha extends CondimentDecorator{



    public Mocha(Beverage beverage){
        super.beverage=beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost()+0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }
}
