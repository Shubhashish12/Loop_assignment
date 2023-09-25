import java.util.Scanner;

public class billing {
    public static void main(String[] args) {

        int order, quantity;
        double total = 0;
        String food = "";

        Scanner sc = new Scanner(System.in);
        String restaurant = "shubasis";

        System.out.println("MENU");
        System.out.println("Food\t\t\t Rate");
        System.out.println("1) momo\t\t\t Rs 100");
        System.out.println("2) ice cream\t\t Rs 120");
        System.out.println("3) cold drinks\t\t Rs 50");
        System.out.println("4) Pizza\t\t Rs 400");
        System.out.println("5) plain rice\t\t Rs 75");
        System.out.println("6) fried rice\t\t Rs 140");
        System.out.println("7) chicken curry\t Rs 80");

        System.out.print("Enter the number of orders you want to place: ");
        int numOrders = sc.nextInt();

        for (int i = 0; i < numOrders; i++) {
             System.out.print("Enter the number of the food you want: ");
              order = sc.nextInt();

            if (order ==1)
            {
                food = "momo";
            }
            else if (order ==2)
            {
                food = "ice cream";
            }
            else if (order== 3)
            {
                food = "Pizza";
            }
            else if (order ==4)
            {
                food = "cold drinks";
            }
            else if (order ==5)
            {
                food = "plain rice";
            }
            else if (order ==6)
            {
                food = "fried rice";
            }
            else if (order ==7)
            {
                food = "Chicken curry";
            }
            else
            {
                System.out.println("Please give a valid order.");
                continue;
            }

            System.out.print("How many orders of " + food + " do you want? ");
            quantity = sc.nextInt();

            System.out.println("Your order is: " + quantity + "" + food);
            System.out.print("Enter Y for Yes and N for No: ");
            String choice = sc.next();

            if (choice.equals("Y")) {
                System.out.println("Your order is getting ready.");
            } else {
                System.out.println("Run Program Again");
                break;
            }

            double orderTotal = 0;

            if (food.equals("momo"))
            {
                orderTotal = 100 * quantity;
            }
            else if (food.equals("ice cream"))
            {
                orderTotal = 120 * quantity;
            }
            else if (food.equals("Pizza"))
            {
                orderTotal = 400 * quantity;
            }
            else if (food.equals("cold drinks"))
            {
                orderTotal = 50 * quantity;
            }
            else if (food.equals("plain rice"))
            {
                orderTotal = 75 * quantity;
            }
            else if (food.equals("fried rice"))
            {
                orderTotal = 140 * quantity;
            }
            else
            {
                orderTotal = 80 * quantity;
            }

            total += orderTotal;
        }

        System.out.println("VAT: 13%");
        System.out.println("Discount: 10%");

        double gtotal = total - (total * 0.1);
        gtotal = gtotal + (gtotal * 0.13);

        System.out.println("Total: " + gtotal);

        sc.close();
        System.out.println("Hope you had wonderful experience");
    }
}
