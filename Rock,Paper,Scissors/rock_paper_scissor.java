import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Random rand = new Random();
        String myresult="";
        String computerresult="";
        int choice = 0;
        do {
            System.out.print("\n Enter 0->Rock \t 1->Paper \t 2->Scissor \n");
            int mychoice = S.nextInt();
            int computerchoice = rand.nextInt(3);

            if(mychoice>=0 && mychoice <=2 ) {


                if (mychoice == computerchoice) {

                    System.out.print("\n Draw \n");
                } else if ((mychoice == 0 && computerchoice == 1) || (mychoice == 1 && computerchoice == 2) || (mychoice == 2 && computerchoice == 0)) {
                    System.out.print("\n You loose\n");
                } else {
                    System.out.print("\n You Win\n");
                }
                if (mychoice == 0) {
                    myresult = "Rock";
                } else if (mychoice == 1) {
                    myresult = "Paper";
                } else if (mychoice == 2) {
                    myresult = "Scissor";
                }

                if (computerchoice == 0) {
                    computerresult = "Rock";
                } else if (computerchoice == 1) {
                    computerresult = "Paper";
                } else if (computerchoice == 2) {
                    computerresult = "Scissor";
                }

                System.out.println("\nYour Choice : " + myresult + "\t Computer's Choice : " + computerresult);
            }else{
                System.out.println("\nEnter a Valid Choice");
            }

            System.out.println("Do you want to restart ? \t 1->Yes \t 2->No\n");
            choice = S.nextInt();

        } while (choice < 2 && choice > 0);
    }
}
