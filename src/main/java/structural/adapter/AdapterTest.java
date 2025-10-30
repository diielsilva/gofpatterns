package structural.adapter;

class AdapterTest {
    private AdapterTest() {
    }

    static void main() {
        PaymentProcessor processor = new ModernPaymentProcessor();
        Order order = new Order("PS5", 3999F);
        boolean paymentResult = processor.pay(order);

        IO.println(paymentResult);
    }
}
