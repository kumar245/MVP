package kumar.mvp.presenter;

import kumar.mvp.BasePresenter;
import kumar.mvp.view.MainView;

/**
 * Created by User on 11/22/2016.
 */

public interface MainMvpPresenter extends BasePresenter <MainView> {
    void loadData();

}
