package modeleViaInterface;

public class ProfileForInt implements ProfileService {
    public void notifyProfileUpdated() {
        System.out.println("Profile notified of address update");
    }
}
