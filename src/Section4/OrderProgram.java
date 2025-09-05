package Section4;

import Section4.EntitiesOrder.Enums.OrderStatus;
import Section4.EntitiesOrder.Order;

import java.util.Date;

public class OrderProgram {
    public static void main(String[] args) {
        Order order = new Order(1800, new Date(), OrderStatus.PROCESSING);
        System.out.println(order);
        OrderStatus os1 = OrderStatus.DELIVERED;// esses dois dão na msm
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");// esses dois dão na msm
        System.out.println(os1);
        System.out.println(os2);
    }
}
