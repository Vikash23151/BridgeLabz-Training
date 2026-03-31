public class UPIPayment implements PaymentMethod {
    private final String upiId;

    public UPIPayment(String upiId){
        this.upiId=upiId;
    }

    @Override
    public String name() {
        return "UPI ("+upiId+")";
    }

    @Override
    public void pay(Order order) throws PaymentFailedException {
        if(!upiId.contains("@")){
            throw new PaymentFailedException("Invalid UPI Id: "+upiId);
        }
    }
}
