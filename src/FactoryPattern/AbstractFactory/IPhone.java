package FactoryPattern.AbstractFactory;

public class IPhone extends Phone{
    @Override
    public void call() {
        System.out.println("call by a IPhone");
    }
}
