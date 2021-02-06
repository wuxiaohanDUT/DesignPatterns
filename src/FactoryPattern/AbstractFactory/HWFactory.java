package FactoryPattern.AbstractFactory;

public class HWFactory extends AbstractFactory{
    @Override
    public Phone makePhone() {
        return new HWPhone();
    }

    @Override
    public Pods makePods() {
        return new HWPods();
    }

    @Override
    public Pad makePad() {
        return new HWPad();
    }
}
