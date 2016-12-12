package Classes;

/**
 * Created by Karoon on 12/11/2016.
 */
public class CMDGetTab {
    private Aggregator a;
    public CMDGetTab(Aggregator agg){
        this.a = agg;
    }
    public Tab execute(){
        return new Tab(a.getMenu(), a.getOrder());
    }
}
