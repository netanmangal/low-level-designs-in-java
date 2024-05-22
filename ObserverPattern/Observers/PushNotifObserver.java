package ObserverPattern.Observers;

import ObserverPattern.Observables.ObservableInterface;

public class PushNotifObserver implements ObserverInterface {

    private ObservableInterface<?> observableInterface;
    private String deviceToken;

    public PushNotifObserver(ObservableInterface<?> observableInterface, String deviceToken) {
        this.observableInterface = observableInterface;
        this.deviceToken = deviceToken;
    }

    @Override
    public void update() {
        // push notification sending logic
        System.out.println("   - PushNotifObserver : sending push notification to : " + deviceToken);
    }

}
