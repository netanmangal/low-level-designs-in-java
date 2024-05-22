package ObserverPattern.Observables;

import ObserverPattern.Observers.ObserverInterface;

public interface ObservableInterface<T> {

    void addObserver(ObserverInterface observer);
    void removeObserver(ObserverInterface observer);
    void notifyAllObservers();
    void setData(T o);
    T getData();

}
