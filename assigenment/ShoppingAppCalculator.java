public class ShoppingAppCalculator {

    public static int calculateTotal(int price) {
        return price;
    }

    public static int calculateTotal(int price, int quantity) {
        return price * quantity;
    }

    public static int calculateTotal(int price1, int price2, int price3) {
        return price1 + price2 + price3;
    }

    public static void main(String[] args) {
        int singleItemPrice = 150;
        System.out.println("Case 1: Single Item");
        System.out.println("Total price: " + calculateTotal(singleItemPrice));

        int pricePerItem = 200;
        int quantity = 3;
        System.out.println("\nCase 2: Multiple Items of the Same Type");
        System.out.println("Total price: " + calculateTotal(pricePerItem, quantity));

        int priceItem1 = 120;
        int priceItem2 = 250;
        int priceItem3 = 300;
        System.out.println("\nCase 3: Three Different Items");
        System.out.println("Total price: " + calculateTotal(priceItem1, priceItem2, priceItem3));
    }
}
