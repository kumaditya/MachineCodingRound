public class OrderService {
    public OrderConfirmation orderConfirmation;

    public OrderService(OrderConfirmation orderConfirmation) {
        this.orderConfirmation = orderConfirmation;
    }


    public void placeOrder(Order order) {
        System.out.println("Processing and placing order #" + order.getOrderId() +
                " for customer: " + order.getCustomerName() +
                " (Amount: $" + order.getTotalAmount() + ")");
        if (orderConfirmation != null) {
            orderConfirmation.confirmOrder(order);
        }
    }
}
