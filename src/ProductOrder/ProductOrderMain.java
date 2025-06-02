package ProductOrder;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductdOrder [] orders = new ProductdOrder[3];

        ProductdOrder order1 = new ProductdOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 3;
        orders[0] = order1;

        ProductdOrder order2 = new ProductdOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 10;
        orders[1] = order2;

        ProductdOrder order3 = new ProductdOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 4 ;
        orders[2] = order3;

        int totalAmount = 0;
        for (ProductdOrder order : orders){
            System.out.println(" 상품명 : " + order.productName + " , 가격 : " + order.price + ", 수량 : " + order.quantity);
            totalAmount +=order.price * order.quantity;

        }

        for ( int i = 0 ;  i < orders.length; i ++ ){
            ProductdOrder o = orders[i];
            System.out.println("상품 이름 = " +  o.productName + "상품 가격 = " + o.price + "상품 수량 = " + o.quantity );

        }

    }
}
