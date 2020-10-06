import java.util.Scanner; 

/**
 * Create multiplication tables from the user's number from 1-12 
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt user to enter in a integer 
    System.out.println("Please enter an integer to create a multiplication table for"); 

    //declare a variable for user's number 
    int userNM = input.nextInt(); 
    //declare variable for multiplication answer 
    int multi; 

    //create for loop for the multiplication table 
    for(int count1 = 1; count1 <= 12; count1++){
    // loop action 
    multi = count1 * userNM;
    System.out.println(count1 + "X" + userNM + "=" + multi);
    }

    
  }
}
