package DecoratorPattern;


/**
*饮料的抽象类
 */
public abstract class Beverage {

    String description="Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double getCost();
}
