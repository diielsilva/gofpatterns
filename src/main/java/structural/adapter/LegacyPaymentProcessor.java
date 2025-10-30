package structural.adapter;


import java.util.Random;

class LegacyPaymentProcessor {

    boolean pay(float price) {
        Random numberGenerator = new Random();
        int limit = numberGenerator.nextInt(99999);

        return limit >= price;
    }
}
