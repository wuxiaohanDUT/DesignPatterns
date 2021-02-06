package FactoryPattern.AbstractFactory;

public class HWPhone extends Phone{
    @Override
    public void call() {
        System.out.println("call by a HWPhone");
    }
}
