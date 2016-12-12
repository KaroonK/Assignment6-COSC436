package Classes;

/**
 * Created by Karoon on 12/11/2016.
 */
public class Aggregator {
    private Menu menu;
    private Order orders;
    public Aggregator(){
        menu = new Menu();
        orders = new Order();
    }
    public Menu getMenu(){return menu;}
    public Order getOrder(){return orders;}
    public void setOrder(Order o){ orders = o;}
}
