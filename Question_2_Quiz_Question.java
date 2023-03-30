import java.util.Scanner;

/**
* Finish the method that checks if the answer to the quiz question is correct.
*
* You should accept answers in any case, but the spelling and spacing must be correct.
*
* (Tip: the answer is "Pong" https://en.wikipedia.org/wiki/Pong)
*/

public class Question_2_Quiz_Question {
    public static String stringInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextLine();
    }
  
   public static void main(String[] args) {
      
       System.out.println("Quiz time!");
       System.out.println("What is the name of the classic 1972 arcade game based on table tennis?");
       String answer = stringInput("Enter your answer: ");
      
       boolean correct = checkAnswer(answer);
      
       if (correct) {
           System.out.println("You are correct!");
       } else {
           System.out.println("Sorry, the answer is Pong.");
       }
      
   }
  
   public static boolean checkAnswer(String answer) {
       // Convert the user's answer and the correct answer to lower case and remove leading/trailing spaces
       String userAnswer = answer.toLowerCase().trim();
       String correctAnswer = "pong".toLowerCase().trim();
       
       // Check if the user's answer is equal to the correct answer
       return userAnswer.equals(correctAnswer);
   }
  
}
