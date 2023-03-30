import java.util.Scanner;

/**
To become a NASA astronaut, you need to be between 58 and 76 inches tall, so you
are not too tall to fit in the spaceship, but are tall enough to reach all the controls.

You also need to be able to swim at least 75 yards, in case you make a water
landing on your return to earth.

This program asks the user questions about their height and swimming ability.
It calls a method to check if the user meets NASA's requirements.
Finish the checkAstronautQualifications method by writing conditional statements
to determine if the user has potential as a NASA astronaut. The method will return true or false.

There are many ways of doing this too - once you've written and tested a solution,
can you think of another way of doing it? Make sure your tests still pass.

*/
public class Question_3_NASA_Astronauts {

   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How tall are you, in inches?");
    double height = input.nextDouble();
    System.out.println("How far can you swim, in yards?");
    double swimDistance = input.nextDouble();
    input.close();

       boolean astronautPotential = checkAstronautQualifications(height, swimDistance);

       if (astronautPotential) {
           System.out.println("You have astronaut potential!");
       } else {
           System.out.println("Sorry, you don't meet NASA's requirements.");
       }

   }

   public static boolean checkAstronautQualifications(double height, double swimDistance) {
       if((75>height && height>58) && swimDistance>=75) return true;

       return false;


   }

}
