package Injection;

public class UserForInj {

//    public static void main(String[] args) {
//        var user = new UserForInj();
//        user.address.updateAddress("aze");
//    }
    private AddressForInj address;
    private ProfileForInj profile;

    public UserForInj() {
        this.profile = new ProfileForInj();
        this.address = new AddressForInj(profile);
    }

    public AddressForInj getAddress() {
        return address;
    }

    public ProfileForInj getProfile() {
        return profile;
    }
}
