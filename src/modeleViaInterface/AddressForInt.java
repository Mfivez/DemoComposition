package modeleViaInterface;

class AddressForInt {
    private ProfileService profileService;

    public AddressForInt(ProfileService profileService) {
        this.profileService = profileService;
    }

    public void updateAddress(String newAddress) {
        System.out.println("Address updated to: " + newAddress);
        profileService.notifyProfileUpdated();
    }
}