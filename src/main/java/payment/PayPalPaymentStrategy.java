package payment;


class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("payment" + price + "made with PayPal");
        return true;
    }
}