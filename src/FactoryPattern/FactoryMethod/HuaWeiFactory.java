package FactoryPattern.FactoryMethod;

public class HuaWeiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new Hwphone();
    }
}
