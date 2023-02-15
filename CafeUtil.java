import java.util.ArrayList;

public class CafeUtil {
    private String customerName;
    private int numWeeks;

    public CafeUtil(String customerName, int numWeeks){
        this.customerName = customerName;
        this.numWeeks = numWeeks;
    };

    public String getName(){
        return customerName;
    }

    public void setName(String customerName){
        this.customerName = customerName;
    }

    public int getNumWeeks(){
        return numWeeks;
    }

    public void setNumWeeks(int numWeeks){
        this.numWeeks = numWeeks;
    }

    public int getStreakGoal(){
        int sum = 0;
        for (int i = 0; i < (numWeeks + 1); i++){
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for (int i = 0; i < prices.length; i++){
            double price = prices[i];
            total = total + price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int id = 0; id < menuItems.size(); id++){
            String oneMenuItem = String.format("%s %s", id, menuItems.get(id));
            System.out.println(oneMenuItem);
        } 
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " +  customers.size() + "  people in front of you");
        customers.add(userName);

    }

    // NINJA BONUS
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product + "\n");
        double costPrice = 0;
        for (int i = 1; i < maxQuantity; i++){
            costPrice = costPrice + price;
            String cost = String.format( "%s - $%.2f", i, costPrice);
            System.out.println(cost);
        }
    }
    
    public void bulkDiscount(String product, double price, int maxQuantity){
        System.out.println(product + "\n");
        double discount = .5;
        double costPrice = 0;
        for (int i = 0; i < maxQuantity; i++){
            if (i == 0) {
                costPrice = price + costPrice;
                Integer id = i + 1;
                String returnBulkPrice = String.format ("%s - $%.2f", id, costPrice);
                System.out.println(returnBulkPrice);
            }
            if (i <= 3 && i != 0) {

                costPrice = costPrice + (price - discount);
                Integer id = i + 1;
                String returnBulkPrice = String.format ("%s - $%.2f", id, costPrice);
                System.out.println(returnBulkPrice);
            }
            if (i > 3  && i != 0){
                discount = discount + .5;
                costPrice = costPrice + (price - discount);
                Integer id = i + 1;
                String returnBulkPrice = String.format ("%s - $%.2f", id, costPrice);
                System.out.println(returnBulkPrice);
            }
        }
    }
}
