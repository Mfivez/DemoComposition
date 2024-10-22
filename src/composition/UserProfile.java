package composition;

public class UserProfile {
    private final User user;

    public UserProfile(User user) {
        this.user = user;
    }

    public void notifyProfileUpdated() {
        System.out.println("Profile notified of address updated");
        user.getAddress().sayHello();
    }


}
