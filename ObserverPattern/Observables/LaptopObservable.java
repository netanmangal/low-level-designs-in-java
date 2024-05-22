package ObserverPattern.Observables;

import ObserverPattern.Observers.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class LaptopObservable implements ObservableInterface<Integer> {

    Integer laptopsAvailable = 0;
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
    public void setData(Integer o) {
        laptopsAvailable = o;
        if (laptopsAvailable > 0) {
            notifyAllObservers();
        } else {
            System.out.println(this.getClass().getName() + " - : Stock not available.");
        }
    }

    @Override
    public Integer getData() {
        return laptopsAvailable;
    }

}
