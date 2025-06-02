package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        //여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder [] orders = new ProductOrder[3];
        //createOrder() 를 사용해서 주문 정보 생성 후 배열에 저장
        orders[0] = createOrders("두부", 2000, 2);
        orders[1]  = createOrders("김치", 5000, 1);
        orders[2] = createOrders("콜라" , 1500, 2);
        //printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);
        //getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 상품 가격 = " + totalAmount);
        //총 결제 금액 출력
    }

    static ProductOrder createOrders(String name, int price, int quantity){
        ProductOrder order = new ProductOrder(); // 객체 생성

        order.productName = name;
        order.price =price;
        order.quantity = quantity;

        return order;

    }
    static void printOrders(ProductOrder[] orders){
//        for(int i = 0; i< orders.length; i++){
//            System.out.println("상품 이름 : " + orders[i].productName + "  수량 = " + orders[i].quantity + " 상품 가격 = " +  orders[i].price);
            for (ProductOrder order : orders ){
                System.out.println("상품명 : " +  order.productName + ", 가격 " +  order.price + ", 수량 " + order.quantity);

        }

    }

    static int getTotalAmount(ProductOrder [] orders) {
        int totalAmount = 0 ;
//        for (int i = 0; i < orders.length; i++ ){
//            totalAmount += orders[i].price * orders[i].quantity;
            for ( ProductOrder order : orders ){
                totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}