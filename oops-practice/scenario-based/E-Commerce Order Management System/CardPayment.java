public class CardPayment implements PaymentMethod{
    private final String card;

    public CardPayment(String card) {
        this.card=card;
    }
    @Override
    public String name(){
        return "Card (" +card+ ")";
    }
    @Override
    public void pay(Order order) throws PaymentFailedException {
        if(order.totalAmount()>100000){
            throw new PaymentFailedException("Card limit exceeded for amount INR "+order.totalAmount());
        }
    }
}
