package ObserverPattern;

import ObserverPattern.Observables.ACObservable;
import ObserverPattern.Observables.IPhoneObservable;
import ObserverPattern.Observables.LaptopObservable;
import ObserverPattern.Observers.EmailObserver;
import ObserverPattern.Observers.PushNotifObserver;
import ObserverPattern.Observers.SMSObserver;

public class Main {

    public static void main(String args[]) {
        IPhoneObservable iPhoneObservable = new IPhoneObservable();
        LaptopObservable laptopObservable = new LaptopObservable();
        ACObservable acObservable = new ACObservable();

        iPhoneObservable.addObserver(new SMSObserver(iPhoneObservable, "+91-1111212333"));
        iPhoneObservable.addObserver(new EmailObserver(iPhoneObservable, "iuser-email@email.comz"));
        iPhoneObservable.addObserver(new PushNotifObserver(iPhoneObservable, "iad3212e-fe556-534321-ee3acc"));

        iPhoneObservable.setData(true);

        laptopObservable.addObserver(new SMSObserver(laptopObservable, "+91-1111212333"));
        laptopObservable.addObserver(new EmailObserver(laptopObservable, "luser-email@email.comz"));
        laptopObservable.addObserver(new PushNotifObserver(laptopObservable, "lad3212e-fe556-534321-ee3acc"));

        laptopObservable.setData(18);

        acObservable.addObserver(new SMSObserver(acObservable, "+91-1111212333"));
        acObservable.addObserver(new EmailObserver(acObservable, "auser-email@email.comz"));
        acObservable.addObserver(new PushNotifObserver(acObservable, "aad3212e-fe556-534321-ee3acc"));

        acObservable.setData(false);
    }

}
