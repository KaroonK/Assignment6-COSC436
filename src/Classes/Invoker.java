package Classes;

/**
 * Created by Karoon on 12/11/2016.
 */
public class Invoker {
    Aggregator agg = new Aggregator();
    public Menu getMenu(){
        return new CMDGetMenu(agg).execute();
    }
    public Order getOrder(){
        return (Order) new CMDSubmitOrder(agg).execute();
    }
    public Tab getTab(){
        return (Tab) new  CMDGetTab(agg).execute();
    }
}
