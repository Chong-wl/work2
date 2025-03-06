import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Slice_o_Heaven {
    public String storeAddress;
    private String storemenu;
    public String storeHours;
    public long storePhoneNumber;
    public String storeEmail;
    public String storeWebsite;
    public String pizaaname;
    public String sides;
    public String pizzaIngredients;
    public String drinks;

    private String orderID;
    private String orderDetails;
    private String orderStatus;
    private double orderTotal=15.00;
    private final String DEF_ORDER_ID="DEF-SOH-099";
    private final String DEF_PIZZA_INGREDIENTS="Mozzarella Cheese";
    private final double DEF_ORDER_TOTAL=15.00;
    public Slice_o_Heaven(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }
    public String getorderID() {
        return this.orderID;
    }
    public void setorderID(String orderID) {
        this.orderID = orderID;
    }
    public String getorderDetails() {
        return this.orderDetails;
    }
    public void setorderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }
    public String getorderStatus() {
        return this.orderStatus;
    }
    public void setorderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public double getorderTotal() {
        return this.orderTotal;
    }
    public void setorderTotal(double orderTotal) {
       
        this.orderTotal = orderTotal;
    }

    public void processCardPayment(String cardNumber, String expiryDate, int cvv,String blacklistedNumber) {

        int cardLength = cardNumber.length();
        if (cardLength == 14) {
           
                        if (cardNumber.equals(blacklistedNumber)) {
                System.out.println("Card is blacklisted, Please use another card");
                return;
            }
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
        }
        String firstCharStr = cardNumber.substring(0, 1);
        String lastfourCharStr = cardNumber.substring(cardNumber.length() - 4);
        int lastfourCardDigit = Integer.parseInt(lastfourCharStr);
        StringBuilder maskedPart = new StringBuilder();
        for (int i = 0; i < cardLength - 5; i++) {
            maskedPart.append('*');
        }
        String cardNumberToDisplay = firstCharStr + maskedPart + lastfourCardDigit;
   
    


    
        System.out.println("Processing card payment...");
        System.out.println("Card number: " + cardNumber);
        System.out.println("Expiry date: " + expiryDate);
        System.out.println("CVV: " + cvv);
        System.out.println("Payment processed successfully!");
    }
    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        StringBuilder message = new StringBuilder();
        message.append("The special offer information of the day is as follows:\n");
        message.append("The pizza of the day:").append(pizzaOfTheDay).append("\n");
        message.append("The side dish of the day:").append(sideOfTheDay).append("\n");
        message.append("Special price:").append(specialPrice);
        System.out.println(message.toString());
    }
    public void Order() {
        this.orderID = DEF_ORDER_ID;
        this.orderDetails = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = "None";
        this.drinks = "None";
      }  
    public void takeOrder(String id, String details, double ordertotal){
        
    ;

        System.out.println("Order accepted!");

        System.out.println("Order is being prepared");
    
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!")

    }
    public void makepizza(String id, String details, double ordertotal){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }
    
        System.out.println("Your pizza is ok!");

        printReceipt();
    }

}

public void takeOrder(String id, String details, double ordertotal){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter three ingredients for your pizza (use spaces to separate ingredients):");
    String[] ingredients = scanner.nextLine().split(" ");
    String ing1 = ingredients[0];
    String ing2 = ingredients[1];
    String ing3 = ingredients[2];


    System.out.println("Enter size of pizza (Small, Medium, Large):");
    String pizzaSize = scanner.nextLine();

    System.out.println("Do you want extra cheese (Y/N):");
    String extraCheese = scanner.nextLine();


    System.out.println("Enter one side dish (Calzone, Garlic bread, None):");
    String sideDish = scanner.nextLine();
    System.out.println("Enter drinks(Cold Coffee, Cocoa drink, Coke, None):");
    String drinks = scanner.nextLine();
    System.out.println("Would you like the chance to pay only half for your order? (Y/N):");
    String halfPayment = scanner.nextLine();

    if (halfPayment.equals("Y")) {
        isItYourBirthday();
        
    }

    System.out.println("Your pizza ingredients are: " + ing1 + ", " + ing2 + ", " + ing3);
    System.out.println("Pizza size: " + pizzaSize);
    System.out.println("Extra cheese: " + extraCheese);
    System.out.println("Side dish: " + sideDish);
    System.out.println("Drinks: " + drinks);

    scanner.close();
  

    System.out.println("Order accepted!");

    System.out.println("Order is being prepared");

    try{
        Thread.sleep(5000);
    } catch (InterruptedException e){
        System.out.println("Order is ready for pickup!");
    }

    System.out.println("Your order is ready!");


    private void printReceipt(){
        Order();
        System.out.println("********RECEIPT********");

        System.out.println("Order ID: " + orderID);
        System.out.println("Order Details: " + orderDetails);
        System.out.println("Order Total: " + orderTotal);
    }
    
