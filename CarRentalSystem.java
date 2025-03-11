public class CarRentalSystem {
    String customerName,carModel;
    int rentalDays;

    CarRentalSystem(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }

    void PrintRent(int rentPerDay){
        System.out.println("Rent for "+rentalDays+" = "+rentPerDay*rentalDays);
    }

    public static void main(String[] args) {
        CarRentalSystem c=new CarRentalSystem("kldsfs","jklsdfjlk",6);

        c.PrintRent(100);
    }
}
