package FactoryPattern.FactoryMethod;

public class TestMain {
    public static void main(String[] argv){
        Phone phone1=new AppleFactory().makePhone();
        Phone phone2=new HuaWeiFactory().makePhone();
        phone1.call();
        phone2.call();
    }
}
