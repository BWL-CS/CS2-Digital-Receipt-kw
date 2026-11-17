import java.util.Scanner;

  public class Main {
  public static void main(String [] args) {
   Scanner input = new Scanner(System.in);
   //String highSchoolName = "Birch Wathen Lenox";
   String snack1 = "Drink";
   String snack2 = "Candy";
   String snack3 = "Hot Dog";
   String snack4 = "Hamburger";
   double drinkPrice = 1.50;
   double candyPrice = 1.25;
   double hotdogPrice = 2.75;
   double hamburgerPrice = 3.50;
   int orderNumber = (int)(Math.random()*100);
   /*int drinksOrdered = (int)(Math.random()*2);
   int candiesOrdered = (int)(Math.random()*2);
   int hotdogsOrdered = (int)(Math.random()*2);
   int hamburgersOrdered = (int)(Math.random()*2);
    */
   int drinksOrdered = input.nextLine("Num of Drinks:");
   int candiesOrdered = input.nextLine("Num of Candy:");
   int hotdogsOrdered = input.nextLine("Num of Hot Dogs:");
   int hamburgersOrdered = input.nextLine("Num of Burgers:");
   String highSchoolName = input.nextLine("Highschool Name:");
   int position = highSchoolName.indexOf(" ");
   
   String initials = highSchoolName.substring(0,1);
   double taxrate = 0.09;
   double subTotal = drinksOrdered * drinkPrice + candyPrice * candiesOrdered + hotdogPrice * hotdogsOrdered + hamburgerPrice * hamburgersOrdered;
   double totalTax = subTotal * taxrate;
   double total = subTotal + totalTax; 
     // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *"); 
     System.out.println("Order Number "+ orderNumber +"                     ");
     System.out.println("     "+highSchoolName+" Snack Bar"+"   ");
     System.out.println("                                    ");
     System.out.println("     "+snack1+"*"+drinksOrdered+ " ..........$"+drinkPrice*drinksOrdered+"");                      
     System.out.println("     "+snack2+"*"+candiesOrdered+" ..........$"+candyPrice*candiesOrdered+"");     
     System.out.println("     "+snack3+"*"+hotdogsOrdered+ " ........$"+hotdogPrice*hotdogsOrdered+"");     
     System.out.println("     "+snack4+"*"+hamburgersOrdered+ " ......$"+hamburgerPrice*hamburgersOrdered+"");  
     System.out.println("Total Cost: " + total + "");   
     System.out.println("*                                    *");    
     System.out.println("**************************************");
     System.out.println(orderNumber);
  }
  }
