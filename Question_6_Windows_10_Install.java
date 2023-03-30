import java.util.Scanner;

public class Question_6_Windows_10_Install {
    public static Double doubleInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextDouble();
    }
    public static String stringInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextLine();
    }

   public static void main(String[] args) {

       String currentOS = stringInput("What is your current operating system?");
       double processorSpeed = doubleInput("What is your current processor speed, in GHz?");
       double ram = doubleInput("How much RAM do you have, in GB?");

       boolean canUpgradeToWindows10 = checkWindows10SystemRequirements(currentOS, processorSpeed, ram);

       if (canUpgradeToWindows10) {
           System.out.println("You can upgrade to Windows 10");
       } else {
           System.out.println("Sorry, you can't upgrade to Windows 10");
       }

   }

   public static boolean checkWindows10SystemRequirements(String currentOS, double processorSpeed, double ram) {

       // Check if the computer meets the upgrade requirements.
       // The computer can be upgraded only if ALL the conditions are met.
       // The two valid currentOS values are the exact Strings "Windows 7" or "Windows 8"
       // Return true if the computer can be upgraded
       // Return false if the computer can't be upgraded.

       boolean meetsRequirements = false;

       if ((currentOS.equals("Windows 7") || currentOS.equals("Windows 8")) && processorSpeed >= 1 && ram >= 2) {
           meetsRequirements = true;
       }

       return meetsRequirements;
   }  
}
