import java.util.Scanner;

public class SliceOHeaven3 {
    public static final String BLACKLISTED_NUMBER = "12345678901234";
    String storeName = "Slice - o - Heaven";
    String storeAddress = "123 Heaven St.";
    String storeEmail = "sliceoheaven1@163.com";
    String storePhone = "234 - 1234";
    String[] storeMenu = {"Pizza", "Sides", "Drinks"};
    String[] sides = {"Garlic Bread", "Salad"};
    String[] drinks = {"Soda", "Water"};
    String[] pizzaIngredients;
    double basePrice = 8.99;
    double toppingPrice = 2.00;
    double pizzaPrice;
    private String orderID;
    private double orderTotal;
    private final String DEF_ORDER_ID = "DEF - SOH - 099";
    private final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    private final double DEF_ORDER_TOTAL = 15.00;
    private String ing1, ing2, ing3;
    private String pizzaSize;
    private String extraCheese;
    private String sideDish;
    private String selectedDrink;
    private String birthday;
    private String cardExpiry;
    private String cardNumber;

    public SliceOHeaven3() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = new String[]{DEF_PIZZA_INGREDIENTS};
        this.orderTotal = DEF_ORDER_TOTAL;
        this.pizzaPrice = basePrice + toppingPrice;
    }

    public SliceOHeaven3(String orderID, String[] pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
        this.pizzaPrice = basePrice + toppingPrice;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public void takeOrder() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to " + storeName + "!");
            System.out.println("Your order ID is: " + orderID);
            int ingChoice1 = 0, ingChoice2 = 0, ingChoice3 = 0;
            boolean validIngredients = false;
            while (!validIngredients) {
                System.out.println("Please pick any three of the following ingredients:");
                System.out.println("1. Mushroom");
                System.out.println("2. Paprika");
                System.out.println("3. Sun-dried tomatoes");
                System.out.println("4. Chicken");
                System.out.println("5. Pineapple");
                System.out.print("Enter any three choices (1, 2, 3,...) separated by spaces:");
                ingChoice1 = scanner.nextInt();
                ingChoice2 = scanner.nextInt();
                ingChoice3 = scanner.nextInt();
                if (ingChoice1 >= 1 && ingChoice1 <= 5 && ingChoice2 >= 1 && ingChoice2 <= 5 && ingChoice3 >= 1 && ingChoice3 <= 5) {
                    validIngredients = true;
                } else {
                    System.out.println("Invalid choice(s). Please pick only from the given list:");
                }
            }
            switch (ingChoice1) {
                case 1:
                    ing1 = "Mushroom";
                    break;
                case 2:
                    ing1 = "Paprika";
                    break;
                case 3:
                    ing1 = "Sun-dried tomatoes";
                    break;
                case 4:
                    ing1 = "Chicken";
                    break;
                case 5:
                    ing1 = "Pineapple";
                    break;
            }
            switch (ingChoice2) {
                case 1:
                    ing2 = "Mushroom";
                    break;
                case 2:
                    ing2 = "Paprika";
                    break;
                case 3:
                    ing2 = "Sun-dried tomatoes";
                    break;
                case 4:
                    ing2 = "Chicken";
                    break;
                case 5:
                    ing2 = "Pineapple";
                    break;
            }
            switch (ingChoice3) {
                case 1:
                    ing3 = "Mushroom";
                    break;
                case 2:
                    ing3 = "Paprika";
                    break;
                case 3:
                    ing3 = "Sun-dried tomatoes";
                    break;
                case 4:
                    ing3 = "Chicken";
                    break;
                case 5:
                    ing3 = "Pineapple";
                    break;
            }
            pizzaIngredients = new String[]{ing1, ing2, ing3};
            int sizeChoice = 0;
            boolean validSize = false;
            while (!validSize) {
                System.out.println("What size should your pizza be?");
                System.out.println("1. Large");
                System.out.println("2. Medium");
                System.out.println("3. Small");
                System.out.print("Enter only one choice (1, 2, or 3):");
                sizeChoice = scanner.nextInt();
                if (sizeChoice >= 1 && sizeChoice <= 3) {
                    validSize = true;
                } else {
                    System.out.println("Invalid choice. Please pick from the given list.");
                }
            }
            switch (sizeChoice) {
                case 1:
                    pizzaSize = "Large";
                    break;
                case 2:
                    pizzaSize = "Medium";
                    break;
                case 3:
                    pizzaSize = "Small";
                    break;
            }
            System.out.print("Do you want extra cheese (Y/N):");
            extraCheese = scanner.next();
            int sideDishChoice = 0;
            boolean validSideDish = false;
            while (!validSideDish) {
                System.out.println("Following are the side dish that go well with your pizza:");
                System.out.println("1. Calzone");
                System.out.println("2. Garlic bread");
                System.out.println("3. Chicken puff");
                System.out.println("4. Muffin");
                System.out.println("5. Nothing for me");
                System.out.print("What would you like? Pick one (1, 2, 3,...):");
                sideDishChoice = scanner.nextInt();
                if (sideDishChoice >= 1 && sideDishChoice <= 5) {
                    validSideDish = true;
                } else {
                    System.out.println("Invalid choice. Please pick from the given list.");
                }
            }
            switch (sideDishChoice) {
                case 1:
                    sideDish = "Calzone";
                    break;
                case 2:
                    sideDish = "Garlic bread";
                    break;
                case 3:
                    sideDish = "Chicken puff";
                    break;
                case 4:
                    sideDish = "Muffin";
                    break;
                case 5:
                    sideDish = "Nothing for me";
                    break;
            }
            int drinkChoice = 0;
            boolean validDrink = false;
            while (!validDrink) {
                System.out.println("Choose from one of the drinks below. We recommend Coca Cola:");
                System.out.println("1. Coca Cola");
                System.out.println("2. Cold coffee");
                System.out.println("3. Cocoa Drink");
                System.out.println("4. No drinks for me");
                System.out.print("Enter your choice:");
                drinkChoice = scanner.nextInt();
                if (drinkChoice >= 1 && drinkChoice <= 4) {
                    validDrink = true;
                } else {
                    System.out.println("Invalid choice. Please pick from the given list.");
                }
            }
            switch (drinkChoice) {
                case 1:
                    selectedDrink = "Coca Cola";
                    break;
                case 2:
                    selectedDrink = "Cold coffee";
                    break;
                case 3:
                    selectedDrink = "Cocoa Drink";
                    break;
                case 4:
                    selectedDrink = "No drinks for me";
                    break;
            }
            System.out.print("Would you like the chance to pay only half for your order? (Y/N):");
            scanner.next();
        }
        orderTotal = orderTotal + pizzaPrice;
        System.out.println("You ordered a pizza and the price is: $" + pizzaPrice);
    }

    public void isItYourBirthday() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean validDate = false;
            while (!validDate) {
                System.out.print("Enter your birthday (YYYY-MM-DD):");
                birthday = scanner.next();
                int year = Integer.parseInt(birthday.split("-")[0]);
                int currentYear = java.time.Year.now().getValue();
                if (currentYear - year > 5 && currentYear - year < 120) {
                    validDate = true;
                } else {
                    System.out.println("Invalid date. You are either too young or too dead to order.");
                    System.out.println("Please enter a valid date:");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid date format. Please enter a valid date in YYYY-MM-DD format.");
        }
    }

    public void makeCardPayment() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean validExpiry = false;
            while (!validExpiry) {
                System.out.print("Enter your card expiry date (MM/YY):");
                cardExpiry = scanner.next();
                int currentMonth = java.time.LocalDate.now().getMonthValue();
                int currentYear = java.time.LocalDate.now().getYear() % 100;
                int expiryMonth = Integer.parseInt(cardExpiry.split("/")[0]);
                int expiryYear = Integer.parseInt(cardExpiry.split("/")[1]);
                if (expiryYear > currentYear || (expiryYear == currentYear && expiryMonth > currentMonth)) {
                    validExpiry = true;
                } else {
                    System.out.println("Invalid expiry date. Please enter a future date.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid date format. Please enter a valid date in MM/YY format.");
        }
    }

    public void processCardPayment() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean validCardNumber = false;
            while (!validCardNumber) {
                System.out.print("Enter your card number (14 digits):");
                cardNumber = scanner.next();
                if (cardNumber.length() == 14 &&!cardNumber.equals(BLACKLISTED_NUMBER)) {
                    validCardNumber = true;
                } else {
                    System.out.println("Invalid card number. Please enter a 14-digit number not on the blacklist.");
                }
            }
        }
    }

    public void specialOfTheDay() {
    }

    public void makePizza() {
        System.out.println("Pizza is being made...");
        System.out.print("Pizza toppings: ");
        for (int i = 0; i < pizzaIngredients.length; i++) {
            System.out.print(pizzaIngredients[i]);
            if (i < pizzaIngredients.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("The pizza is ready");
    }

    @Override
    public String toString() {
        return "Receipt\n" +
                "Order ID: " + orderID + "\n" +
                "Pizza Ingredients: " + ing1 + ", " + ing2 + ", " + ing3 + "\n" +
                "Pizza Size: " + pizzaSize + "\n" +
                "Extra Cheese: " + extraCheese + "\n" +
                "Side Dish: " + sideDish + "\n" +
                "Drink: " + selectedDrink + "\n" +
                "Birthday: " + birthday + "\n" +
                "Card Expiry: " + cardExpiry + "\n" +
                "Card Number: " + cardNumber + "\n" +
                "Total Price: $" + orderTotal + "\n" +
                "Thank you for your visit";
    }

    public static void main(String[] args) {
        SliceOHeaven3 pizzeria1 = new SliceOHeaven3();
        pizzeria1.takeOrder();
        pizzeria1.isItYourBirthday();
        pizzeria1.makeCardPayment();
        pizzeria1.processCardPayment();
        pizzeria1.specialOfTheDay();
        pizzeria1.makePizza();
        System.out.println(pizzeria1);
        String[] customIngredients = {"Dough", "Tomato Sauce", "Cheese", "Pepperoni"};
        SliceOHeaven3 pizzeria2 = new SliceOHeaven3("CUST - SOH - 100", customIngredients, 20.00);
        pizzeria2.takeOrder();
        pizzeria2.isItYourBirthday();
        pizzeria2.makeCardPayment();
        pizzeria2.processCardPayment();
        pizzeria2.specialOfTheDay();
        pizzeria2.makePizza();
        System.out.println(pizzeria2);
    }
}