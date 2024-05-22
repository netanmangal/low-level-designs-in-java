package ObserverPattern.Observables;

import ObserverPattern.Observers.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class ACObservable implements ObservableInterface<Boolean> {

    Boolean isACAvailable = false;
    List<ObserverInterface> observers = new ArrayList<ObserverInterface>();

    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverInterface observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        System.out.println("Notifying all observers from class : " + this.getClass().getName());
        for (ObserverInterface o : observers) {
            o.update();
        }
    }

    @Override
    public void setData(Boolean o) {
        isACAvailable = o;
        if (isACAvailable) {
            notifyAllObservers();
        } else {
            System.out.println(this.getClass().getName() + " - : Stock not available.");
        }
    }

    @Override
    public Boolean getData() {
        return isACAvailable;
    }

}
