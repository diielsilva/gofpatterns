package structural.adapter;

class ModernPaymentProcessor implements PaymentProcessor {
    private final LegacyPaymentProcessor processor;

    ModernPaymentProcessor() {
        this.processor = new LegacyPaymentProcessor();
    }

    @Override
    public boolean pay(Order order) {
        boolean wasPaid = processor.pay(order.price());

        if (wasPaid) {
            IO.println("Your payment was approved");
        } else {
            IO.println("Payment denied");
        }

        return wasPaid;
    }
}
