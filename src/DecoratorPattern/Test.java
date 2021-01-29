package DecoratorPattern;

public class Test {
    public static void main(String[] argc){
        Beverage coffe=new Coffe();
        Beverage milk=new Milk();
        Mocha mochacoffe=new Mocha(coffe);
        Sugar sugarmochacoffe=new Sugar(mochacoffe);
        Sugar sugarmilk=new Sugar(milk);
        System.out.println(sugarmochacoffe.getDescription());
        System.out.println(sugarmilk.getDescription());
    }
}
