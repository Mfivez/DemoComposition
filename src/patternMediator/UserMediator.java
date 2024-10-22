package patternMediator;

import composition.UserAddress;
import composition.UserProfile;

public class UserMediator {
    private AddressForMediatorExemple address;
    private ProfileForMediatorExemple profile;

    public UserMediator() {
        this.address = new AddressForMediatorExemple(this);
        this.profile = new ProfileForMediatorExemple(this);
    }

    public void addressUpdated(String newAddress) {
        address.updateAddress(newAddress);
        profile.notifyProfileUpdated();
    }
}
