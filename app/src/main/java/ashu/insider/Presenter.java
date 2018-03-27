package ashu.insider;

import java.util.List;

/**
 * Created by apple on 28/03/18.
 */

public class Presenter {

    private MainView mainView;

    public Presenter(MainView mainView){
        this.mainView = mainView;
    }

    void onDestroy(){
        mainView = null;
    }

    void callEvents(){
        NetworkController controller = new NetworkController();
        controller.start();
    }

    void loadEvents(InsiderDTO lists){
        mainView.populateEvents(lists);
    }
}
