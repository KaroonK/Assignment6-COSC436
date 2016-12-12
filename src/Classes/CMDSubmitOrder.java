package Classes;

import Interfaces.CMDInterface;
import java.util.Scanner;
/**
 * Created by Karoon on 12/11/2016.
 */
public class CMDSubmitOrder implements CMDInterface{
    private Aggregator a;

    public CMDSubmitOrder(Aggregator agg){
        a = agg;
    }
    public Object execute() {
        int userChoice;
        Scanner input = new Scanner(System.in);
        Menu aMenu = a.getMenu();
        aMenu.printMenu();
        System.out.print("Please enter a menu number, -1 to quit: ");
        userChoice = input.nextInt();
        Order ord = new Order();
        while(userChoice != -1){
            try {
                ord.addOrder(aMenu.getMenu().get(userChoice));
                System.out.print("Another item (-1 to quit): ");
                userChoice = input.nextInt();
            }catch(IndexOutOfBoundsException e){
                System.out.println("Please enter a number from the menu");
                System.out.print("Another item (-1 to quit): ");
                userChoice = input.nextInt();
            }
        }
        return null;
    }
}
