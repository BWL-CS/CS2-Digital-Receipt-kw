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
   System.out.println("Drinks:");
   int drinksOrdered = input.nextInt();
   System.out.println("Candies:");
   int candiesOrdered = input.nextInt();
   System.out.println("HDs:");
   int hotdogsOrdered = input.nextInt();
   System.out.println("Burgers:");
   int hamburgersOrdered = input.nextInt();
   input.nextLine();
   System.out.println("HighSchoolName:");
   String highSchoolName = input.nextLine();

   double taxrate = 0.09;
   double subTotal = drinksOrdered * drinkPrice + candyPrice * candiesOrdered + hotdogPrice * hotdogsOrdered + hamburgerPrice * hamburgersOrdered;
   double totalTax = subTotal * taxrate;
   double total = subTotal + totalTax; 
   int spaceCount = 0;
   int position = highSchoolName.indexOf(" ");
   String remainWords = highSchoolName.substring(position+1);
   String initials = highSchoolName.substring(0,1);
   for(int i = 0; i < highSchoolName.length(); i++){
    if (highSchoolName.substring(i, i+1).equals(" ")){
      spaceCount +=1;
    }
   }
   for(int i = 0; i< spaceCount; i++){
    initials = initials + remainWords.substring(0,1);
    position = remainWords.indexOf(" ");
    remainWords = remainWords.substring(position + 1);

   }
    // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *"); 
     System.out.println("Order Number "+ orderNumber +"                     ");
     System.out.println("     "+initials+" Snack Bar"+"   ");
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
