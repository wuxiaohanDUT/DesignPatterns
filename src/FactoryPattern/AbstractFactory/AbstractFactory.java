package FactoryPattern.AbstractFactory;

public abstract class AbstractFactory {
    abstract public Phone makePhone();
    abstract public Pods makePods();
    abstract public Pad makePad();
}
