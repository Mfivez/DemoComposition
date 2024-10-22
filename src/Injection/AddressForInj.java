package Injection;

import modeleViaInterface.ProfileForInt;

public class AddressForInj {
    private ProfileForInj profile;

    public AddressForInj(ProfileForInj profile) {
        this.profile = profile;
    }

    public void updateAddress(String newAddress) {
        System.out.println("Address updated to: " + newAddress);
        profile.notifyProfileUpdated();
    }
}
