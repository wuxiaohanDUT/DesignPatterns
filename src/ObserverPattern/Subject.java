package ObserverPattern;

import java.util.List;

interface Subject {
    void Attach(Observer observer);
    void Detach(Observer observer);
    void Notify();
}
