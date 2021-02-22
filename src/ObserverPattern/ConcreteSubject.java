package ObserverPattern;

import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observerList;
    ConcreteSubject(){
        observerList=new LinkedList<>();
    }
    @Override
    public void Attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void Notify() {
        System.out.println("具体主题对象发出通知：");
        for(Observer observer:observerList){
            observer.Update();
        }
    }
}
