public class SMSConfirmationService implements OrderConfirmation {
    @Override
    public void confirmOrder(Order order) {
        System.out.println("[SMS] Confirmation SMS sent to " + order.getCustomerPhone() +
                " for Order ID: " + order.getOrderId() +
                " (Total: $" + order.getTotalAmount() + ")");
    }
}
