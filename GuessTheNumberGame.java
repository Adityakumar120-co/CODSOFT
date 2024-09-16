import java.util.Scanner;//used to take input by the user.
import java.util.Random;//used for random number generation.

     public class GuessTheNumberGame{
  
           public static void main(String[]args){ 

        Scanner input = new Scanner(System.in);
        Random  randomNumber = new Random();
  
        int userScore = 0;
        boolean playAgain = true;
   
        while(playAgain)
          {
            int targetNumber = randomNumber.nextInt(50) + 1;
            int numberOfAttempts = 0;
            int maxAttempts = 5;

            boolean hasGuessedRight =  false;
  
            System.out.println("Let,s guess the number( between 1 and 50 ):");

            while(numberOfAttempts < maxAttempts && !hasGuessedRight)
               { 
                 numberOfAttempts++;
                 System.out.println("Attempts" + numberOfAttempts + ":");
             
                 int userGuess = input.nextInt();
                 int numberDiffrence = Math.abs(userGuess - targetNumber);
                  
                 if(numberDiffrence == 0){
                  System.out.println("Correct you have guessed the number");
                  userScore = userScore + 1;
                   break;
                 } else if (numberDiffrence <= 5){
                  System.out.println("Too close my friend");
                 
                 } else if(userGuess < targetNumber){
                  System.out.println("Too low!");
                 }else if (userGuess > 50){
                  System.out.println("Out of the range!");
                 }else{
                  System.out.println("Too high!");
                 }
                                                
               }
                 if(!hasGuessedRight){
                    System.out.println("You have used all attempts.The correct number was " + targetNumber);
                    }
              
                    System.out.println("Your userScore is :" + userScore);


                   System.out.println("Do you want to play again? (yes/no)");
                 
                   String userResponse = input.next();
                   playAgain = userResponse.equalsIgnoreCase("yes");//if yes the game will start again. 
               } 
                   input.close();
                      System.out.println("Thanks for playing.");
       
            }
       
         }