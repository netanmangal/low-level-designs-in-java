package ObserverPattern.Observers;

import ObserverPattern.Observables.ObservableInterface;

public class SMSObserver implements ObserverInterface {

    private ObservableInterface<?> observableInterface;
    private String mobNo;

    public SMSObserver(ObservableInterface<?> observableInterface, String mobNo) {
        this.observableInterface = observableInterface;
        this.mobNo = mobNo;
    }

    @Override
    public void update() {
        // sms sending logic
        System.out.println("   - SMSObserver : sending SMS to : " + this.mobNo);
    }

}
