package AAA;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[2];

        orders[0] = createOrder("카레라이스", 8000, 2);
        orders[1] = createOrder("비빔밥", 8000, 1);
        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
    static void printOrder(ProductOrder[] orders){
        for(ProductOrder order : orders){
            System.out.println("상품명: "+order.productName+" ,가격: "+order.price+" ,수량: "+order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order:orders){
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
