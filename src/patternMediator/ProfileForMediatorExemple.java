package patternMediator;

public class ProfileForMediatorExemple {
    private UserMediator mediator;

    public ProfileForMediatorExemple(UserMediator mediator) {
        this.mediator = mediator;
    }

    public void notifyProfileUpdated() {
        System.out.println("Profile notified of address update");
    }
}
