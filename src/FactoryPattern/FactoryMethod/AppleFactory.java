package FactoryPattern.FactoryMethod;

public class AppleFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new Iphone();
    }
}
