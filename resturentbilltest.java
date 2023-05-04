import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class RestaurantBillTest {



    @Test

    public void testCalculateBill() {

        RestaurantBill bill = new RestaurantBill();

        bill.addItem("Burger", 10.00);

        bill.addItem("Fries", 5.00);

        bill.addItem("Drink", 2.50);

        

        double total = bill.calculateBill();

        

        assertEquals(17.50, total, 0.001);

    }

    

    @Test

    public void testCalculateBillWithDiscount() {

        RestaurantBill bill = new RestaurantBill();

        bill.addItem("Burger", 10.00);

        bill.addItem("Fries", 5.00);

        bill.addItem("Drink", 2.50);

        bill.setDiscount(0.1); // 10% discount

        

        double total = bill.calculateBill();

        

        assertEquals(15.75, total, 0.001);

    }

    

}