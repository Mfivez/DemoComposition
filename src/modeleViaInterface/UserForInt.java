package modeleViaInterface;

public class UserForInt {
    private AddressForInt address;
    private ProfileForInt profile;

    public UserForInt() {
        this.profile = new ProfileForInt();
        this.address = new AddressForInt(profile);
    }

    public AddressForInt getAddress() {
        return address;
    }

    public ProfileForInt getProfile() {
        return profile;
    }
}