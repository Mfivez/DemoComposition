package composition;

public class UserAddress {
    private User user;

    public UserAddress(User user) {
        this.user = user;
    }

    public void updateAddress(String newAddress) {
        System.out.println("address updated to".concat(newAddress));
        user.getProfile().notifyProfileUpdated();
    }

    public void sayHello() {
        System.out.println('a');
    }
}
