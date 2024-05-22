package ObserverPattern.Observers;

import ObserverPattern.Observables.ObservableInterface;

public class EmailObserver implements ObserverInterface {

    private ObservableInterface<?> observableInterface;
    private String email;

    public EmailObserver(ObservableInterface<?> observableInterface, String email) {
        this.observableInterface = observableInterface;
        this.email = email;
    }

    @Override
    public void update() {
        // email sending logic
        System.out.println("   - EmailObserver : sending email to : " + this.email);
    }

}
