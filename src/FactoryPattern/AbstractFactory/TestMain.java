package FactoryPattern.AbstractFactory;

public class TestMain {
    public static void main(String[] argv){
        AbstractFactory Apple=new AppleFactory();
        AbstractFactory HuaWei=new HWFactory();
        Person person1=new Person(Apple.makePhone(),Apple.makePods(),Apple.makePad());
        Person person2=new Person(HuaWei.makePhone(),HuaWei.makePods(),HuaWei.makePad());
        person1.show();
        person2.show();
    }
}
class Person{
    Phone phone;
    Pods pods;
    Pad pad;
    Person(Phone phone,Pods pods,Pad pad){
        this.phone=phone;
        this.pods=pods;
        this.pad=pad;
    }
    public void show(){
        phone.call();
        pods.play();
        pad.use();
    }
}
