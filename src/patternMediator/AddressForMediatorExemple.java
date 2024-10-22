package patternMediator;

public class AddressForMediatorExemple {
    private UserMediator mediator;

    public AddressForMediatorExemple(UserMediator mediator) {
        this.mediator = mediator;
    }

    public void updateAddress(String newAddress) {
        System.out.println("Address updated to: " + newAddress);
        mediator.addressUpdated(newAddress);
    }
}
