package Week_2;


enum OrderStatus{
PLACED("Order has placed..."),
SHIPPED("Order has shipped..."),
DELIVERED("Order has delivered..."),
CANCELLED("Order has cancelled...");

String message;
OrderStatus(String message)
{
   this.message = message;
}

String getMessage()
{
  return message;
}
}
public class Program_7 {
    public static void main(String[] args) {
        OrderStatus obj1 = OrderStatus.SHIPPED;
        System.out.println(obj1.getMessage());

    }


}
