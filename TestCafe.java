import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil("Jane", 10);

        /* ============ App Test Cases ============= */

        // Testing getName method 
        System.out.println(appTest.getName());
        
        // Testing setNumWeeks method - ability to change # of weeks
        appTest.setNumWeeks(9);


        // STREAK GOAL TEST
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week %s: %s \n\n", appTest.getNumWeeks(), appTest.getStreakGoal());
    
        // ORDER TOTAL TEST
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        
        
        // DISPLAY MENU TEST
        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
        
        ADD CUSTOMER TEST
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
                appTest.addCustomer(customers);
                System.out.println("\n");
            }
            
        // PRINT PRICE CHART TEST
        System.out.println("\n ----- Print Price Chart Test----- \n");
        appTest.printPriceChart("Ube Latte", 4.25, 5);
        
        // BULK DISCOUNT TEST
        System.out.println("\n----- Bulk Discount Test----- \n");
        appTest.bulkDiscount("Americano", 2.00, 5);

        System.out.println("\n");
        appTest.bulkDiscount("Ube Latte", 4.25, 8);
        System.out.println("\n");
        

    }
}
