package Classes;
import java.util.Scanner;
/**
 * Created by Karoon on 12/11/2016.
 */
public class UserInterface {

    public static void main(String [] args){
        int userChoice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Khatiwada Cafe - ");
        do{
            System.out.println("1. Display the Menu");
            System.out.println("2. Submit an Order");
            System.out.println("3. Receive Tab");
            System.out.println("4. Exit");
            System.out.print("Please enter a menu number: ");
            userChoice = input.nextInt();
            switch(userChoice){
                case 1:
                    SystemInterface.getMenu();
                    break;
                case 2:
                    SystemInterface.getOrder();
                    break;
                case 3:
                    SystemInterface.getTab();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please enter a valid menu number.");
                    break;
            }
        }while (userChoice!=4);
        input.close();
    }
}
