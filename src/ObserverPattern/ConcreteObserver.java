package ObserverPattern;

public class ConcreteObserver implements Observer{
    String name;
    ConcreteObserver(String name){
        this.name=name;
    }
    @Override
    public void Update() {
        System.out.println(name+"收到通知");
    }
}
