import org.example.Product;
import org.example.ProductList;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static ProductList productListObj = new ProductList();
    private static Main obj = new Main();

    public static void main(String[] args) {

        //Create Products
        obj.createProducts();

        //Display Products to user
        obj.displayProducts();

        //Taking user requirements
        obj.getUserChoice();
    }

    private void displayProducts() {
        System.out.println("\n\t\t\t\tWELCOME TO Big Bazaar\n========================================================");
        System.out.println("\nWe have these products for you. Enjoy Shopping!!!");
        System.out.println("Id\t\tName\t\tQuantity\t\tPrice\t\tBrand\n--------------------------------------------------------");
        for (Product product : productListObj.getProductList())
            System.out.println(product.toString());
    }

    private void createProducts() {
        Product biscuit = new Product(1, "Biscuit", 800, 10, "Oreo");
        Product namkeen = new Product(2, "Namkeen", 900, 50, "Lehar");
        Product noodle = new Product(3, "Noodles", 700, 40, "Maggie");
        Product oat = new Product(4, "Oats", 600, 80, "Oats");
        Product pen = new Product(5, "Pens", 500, 110, "Luxor");
        Product shirt = new Product(6, "Shirts", 600, 900, "Zara");
        Product shoes = new Product(7, "Shoes", 800, 100, "Bata");

        //Get ProductList
        List<Product> productList = productListObj.getProductList();

        //Adding Products to List
        productListObj.addProductsToList(biscuit);
        productListObj.addProductsToList(namkeen);
        productListObj.addProductsToList(noodle);
        productListObj.addProductsToList(oat);
        productListObj.addProductsToList(pen);
        productListObj.addProductsToList(shirt);
        productListObj.addProductsToList(shoes);
    }

    private void getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        int billPrice = 0;
        String bill = "";
        do {
            System.out.println("\nEnter id and quantity of product you want to buy");
            System.out.println("Enter product id : ");
            int productId = scanner.nextInt();
//            boolean pIdChoice = true;
//            if(productId>7 || productId<1){
//                pIdChoice = false;
//                System.out.println("Incorrect Product Id entered, Try Again.");
//            }
//          if(pIdChoice) {
    System.out.println("Enter product quantity you want to buy : ");
    int productQuantity = scanner.nextInt();
    for (Product product : productListObj.getProductList()) {
        if (product.getId() == productId) {
            if (product.getQuantity() < productQuantity) {
                System.out.println("Sorry, " + productQuantity + " " + product.getName() + " are temporary unavailable");
                System.out.println("We have " + product.getQuantity() + " " + product.getName() + " available");
                System.out.println("Do you want to buy " + product.getQuantity() + " " + product.getName() + "? (Y/N)");
                if (scanner.next().equalsIgnoreCase("y"))
                    productQuantity = product.getQuantity();
                else
                    break;
            }
            billPrice += product.getPrice() * productQuantity;
            product.setQuantity(product.getQuantity() - productQuantity);

            //Generating bill
            bill += product.getId() + "\t\t" + product.getName() + "\t\t" + productQuantity + "\t\t\t\t" + product.getPrice() + "\t\t\t" + product.getBrand() + "\t\t" + (product.getPrice() * productQuantity) / 10 + "\t\t\t\t" + product.getPrice() * productQuantity + "\n";
            break;
        }
    }

                System.out.println("Do you want to buy more products?(Y/N)");
                choice = scanner.next();
            } while (choice.equalsIgnoreCase("y"));



    String coupon = "extra10";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter coupon code: ");
    String code = sc.next();

    int couponDisc = 0;
    int moredisc = 0;




                if (coupon.equals(code)) {
                    couponDisc = 10;
                    moredisc = billPrice / couponDisc;
                    System.out.println("Entered coupon code is: " + coupon);
                } else {
                    System.out.println("Incorrect coupon code entered !!");
                }

                System.out.println("\nYour bill : ");
                System.out.println("Id\t\tName\t\tQuantity\t\tPrice\t\tBrand\t\tDiscount\t\tTotal\n----------------------------------------------------------------------------------------");
                System.out.println(bill);

                int disc = billPrice / 10;
                int delCharge = billPrice/100;
                double gstamt = (((billPrice - disc + delCharge) - moredisc) * 0.14);
                System.out.println("your coupon discount is:\t\t\t\t\t\t\t\t\t\t\t\t\t " + moredisc);
                System.out.println("delivery charge is:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + delCharge);
                System.out.println("GST: 14% after discount:\t\t\t\t\t\t\t\t\t\t\t\t\t" + String.format("%.2f", gstamt));
                System.out.println("Your final bill is:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + (((billPrice - disc + delCharge) - moredisc) + gstamt));

                System.out.println("\nDo you again want to see products?(Y/N)");
                String seeProducts = scanner.next();
                if (seeProducts.equalsIgnoreCase("y")) {
                    obj.displayProducts();
                    System.out.println("\nPress 'Y' to buy products again\nPress 'N' to exit");
                    if (scanner.next().equalsIgnoreCase("y"))
                        obj.getUserChoice();
                }
                System.out.println("\nThankyou for shopping. Enjoy your day!!");
            }
//        } while (choice.equalsIgnoreCase("y"));

    }


