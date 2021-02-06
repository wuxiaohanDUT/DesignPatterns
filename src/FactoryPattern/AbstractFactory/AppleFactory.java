package FactoryPattern.AbstractFactory;

public class AppleFactory extends AbstractFactory{
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public Pods makePods() {
        return new IPods();
    }

    @Override
    public Pad makePad() {
        return new IPad();
    }
}
