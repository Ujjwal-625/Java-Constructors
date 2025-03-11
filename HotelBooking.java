public class HotelBooking {
    int nights;
    String guestName,roomType;

    HotelBooking(){
        this.guestName="akfjdl";
        this.roomType="fjsdlj";
        this.nights=3;
    }
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    HotelBooking(HotelBooking h){
        this.guestName=h.guestName;
        this.roomType=h.roomType;
        this.nights=h.nights;
    }

    public static void main(String[] args) {
            HotelBooking h1=new HotelBooking();

            HotelBooking h2=new HotelBooking("fkljsl","kfdskf",4);

            HotelBooking h3=new HotelBooking(h2);
    }
}
