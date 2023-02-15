import java.util.ArrayList;

public class CafeUtil {
    // reward # 
    // numOfDrinksPurchased
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
}
