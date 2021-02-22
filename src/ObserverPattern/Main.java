package ObserverPattern;

public class Main {
    public static void main(String[] argc){
        Subject subject=new ConcreteSubject();
        Observer observer1=new ConcreteObserver("observer1");
        Observer observer2=new ConcreteObserver("observer2");
        Observer observer3=new ConcreteObserver("observer3");
        subject.Attach(observer1);
        subject.Attach(observer2);
        subject.Attach(observer3);
        subject.Notify();
    }
}
