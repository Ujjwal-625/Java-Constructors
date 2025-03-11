public class Vehicle {
    String ownerName,vehicleType;
    static int registrationFee=2000;
    Vehicle(){
        ownerName="jfklsjklf";
        vehicleType="jfsdklfjskld";
    }

    void displayVehicleDetails(){
        System.out.println("OwnerName " +ownerName);
        System.out.println("vehicle type "+vehicleType);
    }
    void updatetheRegistrationFee(int newFee){
        System.out.println("Updating the registration fee");
        registrationFee=newFee;
    }

    public static void main(String[] args) {
        Vehicle v=new Vehicle();

        System.out.println("Registration fee "+ Vehicle.registrationFee);

        v.updatetheRegistrationFee(10987);

        System.out.println("Registration fee "+ Vehicle.registrationFee);

        v.displayVehicleDetails();
    }
}
