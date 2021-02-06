package FactoryPattern.FactoryMethod;

public class Hwphone extends Phone{
    @Override
    public void call() {
        System.out.println("call by a hwphone");
    }
}
