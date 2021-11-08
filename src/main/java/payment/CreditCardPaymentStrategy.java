package payment;

class CreditCardPaymentStrategy implements Payment{
    public boolean pay(double price) {
        System.out.println("payment" + price + "made with credit card");
        return true;
    }
}
