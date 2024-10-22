package composition;

public class Main {
    public static void main(String[] args) {
        var user = new User();

        user.getAddress().updateAddress("aze");
        user.getProfile().notifyProfileUpdated();
    }
}
