package core.domain.employeeCreationComponent;

import java.util.ArrayList;
import java.util.List;

public class PaymentNotifier implements Notifier{

    private List<Subscriber> paymentSubscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        paymentSubscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        paymentSubscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers(String context) {
        for(Subscriber subscriber: paymentSubscribers){
            subscriber.update("Payroll paid", context);
        }
    }


}
