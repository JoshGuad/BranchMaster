import java.util.Scanner;

public class WeekFive
{
   public static void main(String [] args)
  {
	//Declaring x as zero or nul so that any left over inputs won't affect the outcome.
	   double AverageAnswer = 0; 
	//Declaring y as zero or null so that any left over inputs won't affect the outcome.
	  				double SumAnswer = 0;  
	 
	// This will tell the user when and how many inputs are required.
	  				
    System.out.println("Input five numbers.");
   
    //The Scanner System in will receive the user inputs and will store the data in the declared variables.
    
    Scanner keyboard = new Scanner(System.in);
    double input1= keyboard.nextDouble();
    double input2= keyboard.nextDouble();
    double input3= keyboard.nextDouble();
    double input4= keyboard.nextDouble();
    double input5= keyboard.nextDouble(); 
    keyboard.close();
    
    //These algorithms will use the stored data in order to complete the mathematical formulas.
   
    AverageAnswer = (input1 +input2 +input3 +input4+ input5)/5;   
   
   
   SumAnswer= input1+input2+input3+input4+input5;
   
    
  //Once the answer is found the system out println will post the answers to both of the equations.
    
    System.out.println("Your answer is " + AverageAnswer + " and "+ SumAnswer);
    
	  }
	  
}