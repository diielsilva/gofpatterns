package structural.adapter;

record Order(String description, float price) {
    @Override
    public String toString() {
        return "Order {" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
