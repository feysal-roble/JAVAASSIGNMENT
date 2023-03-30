import java.util.Scanner;

public class Question_4_Mail_Prices {

   // Use these values in the calculateStampPrice method to calculate the total price to mail the letter.
   public static int MACHINABLE_LETTER_PRICE = 49;
   public static int NON_MACHINABLE_SURCHARGE = 21;

   public static void main(String[] args) {

       boolean isRectangular = yesNoInput("Is the letter rectangular?");
       boolean isFlat = yesNoInput("Is the letter flat?");

       // Calculate price, in cents
       int price = calculateStampPrice(isRectangular, isFlat);

       System.out.println("Your letter will cost " + price + " cents to mail.");

       // Optional - if preferred, display the price as dollars and cents.

   }

   public static boolean yesNoInput(String prompt) {
       Scanner input = new Scanner(System.in);
       System.out.print(prompt + " (y/n) ");
       String response = input.next();
       return response.equalsIgnoreCase("y");
   }

   /* Calculate and return the price, in cents, to mail the letter.  */
   public static int calculateStampPrice(boolean isRectangle, boolean isFlat) {

       // Calculate the base price of the letter.
       int basePrice = MACHINABLE_LETTER_PRICE;

       // If the letter is not rectangular, add the non-machinable surcharge.
       if (!isRectangle) {
           basePrice += NON_MACHINABLE_SURCHARGE;
       }

       // If the letter is flat, double the price.
       if (isFlat) {
           basePrice *= 2;
       }

       // Return the final price.
       return basePrice;

   }

}
