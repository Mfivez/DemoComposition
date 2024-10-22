package composition;

public class User {
    private UserAddress address;
    private UserProfile profile;

    public User() {
        this.address = new UserAddress(this);
        this.profile = new UserProfile(this);
    }

    public UserAddress getAddress() {
        return address;
    }

    public UserProfile getProfile() {
        return profile;
    }
}
