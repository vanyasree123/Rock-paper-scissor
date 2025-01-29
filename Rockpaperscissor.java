import java.util.*;
public class Rockpaperscissor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        String[] choice={"Rock","Paper","Scissor"};
        System.out.println("Welcome to the Game!!");
        System.out.println("i have guessed one in the given string !");
         while (true) { 
            System.out.println("Enter ur choice(Rock,Paper,Scissor)");
            String userchoice=scanner.nextLine().trim();
            String computerchoice=choice[random.nextInt(3)];
            System.out.println("Computer chose:"+computerchoice);  
            if (userchoice.equals(computerchoice)) {
                System.out.println("It's a tie!");
              } else if ((userchoice.equals("rock") && computerchoice.equals("scissors")) ||
                    (userchoice.equals("paper") && computerchoice.equals("rock")) ||
                    (userchoice.equals("scissors") && computerchoice.equals("paper"))) {
                System.out.println("You win!");
             } else {
                System.out.println("You lose!");
              }
          }while(sacnner!=null);
          scanner.close();
          }
        }

        
    

