package core.domain.employeeCreationComponent;

public interface Notifier {
    public void subscribe(Subscriber subscriber);

    public void unsubscribe(Subscriber subscriber);

    public void notifySubscribers(String context);
}
