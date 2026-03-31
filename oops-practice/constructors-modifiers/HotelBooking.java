public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    HotelBooking(){
        guestName="Jane Doe";
        roomType="Base";
        nights=2;
    }
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    HotelBooking(HotelBooking previousPerson){
        this.guestName=previousPerson.guestName;
        this.roomType= previousPerson.roomType;
        this.nights= previousPerson.nights;
    }
    void getPersonDetails(){
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room Type: "+roomType);
        System.out.println("Number of nights: "+nights);
        System.out.println();
    }

    public static void main(String[] args) {
        // default
        HotelBooking guest1=new HotelBooking();
        guest1.getPersonDetails();

        // user defined
        HotelBooking guest2=new HotelBooking("Ryuga","Deluxe",5);
        guest2.getPersonDetails();

        //copy constructor
        HotelBooking guest3=new HotelBooking(guest2);
        guest3.getPersonDetails();
    }
}
