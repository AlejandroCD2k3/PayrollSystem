package core.domain.employeeCreationComponent;

public class PaymentNotifierFacade {

    private Notifier notifier = new PaymentNotifier();

    public void notifyPayment(String context){
        notifier.notifySubscribers(context);
    }

}
