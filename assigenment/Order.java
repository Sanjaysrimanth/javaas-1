class Order {
    private String customerName;
    private String cakeType;
    private int quantity;
    private double pricePerCake;

    public Order(String customerName, String cakeType, int quantity) {
        this.customerName = customerName;
        this.cakeType = cakeType;
        this.quantity = quantity;

        switch (cakeType.toLowerCase()) {
            case "chocolate":
                this.pricePerCake = 350;
                break;
            case "vanilla":
                this.pricePerCake = 300;
                break;
            default:
                this.pricePerCake = 250; 
                break;
        }
    }
    public double calculateTotalPrice() {
        return quantity * pricePerCake;
    }
    public void displayOrderDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Cake Type: " + cakeType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Cake: ₹" + pricePerCake);
        System.out.println("Total Price: ₹" + calculateTotalPrice());
    }
    public static void main(String[] args) {
        Order order = new Order("Kavya", "Chocolate", 3);

        order.displayOrderDetails();
    }
}
