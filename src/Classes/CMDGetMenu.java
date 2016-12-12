package Classes;

import Interfaces.CMDInterface;

/**
 * Created by Karoon on 12/11/2016.
 */
public class CMDGetMenu implements CMDInterface {
    private Aggregator a;

    public CMDGetMenu(Aggregator a){
        this.a = a;
    }
    public Menu execute(){
        System.out.println("CMD GET MENU Execute.\n");
        return a.getMenu();
    }
}
