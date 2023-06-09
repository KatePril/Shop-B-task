package app.contollers;

import app.models.AppModel;
import app.utils.Constants;
import app.views.AppView;

import java.util.Scanner;

public class AppController {

    public void runApp() {
        AppView view = new AppView();
        AppModel model = new AppModel();

        filterOption(view.getOption(), model, view);
    }

    private void filterOption(int option, AppModel model, AppView view) {
        switch (option) {
            case 1 -> {
                model.executeOptionOne();
                filterOption(view.getOption(), model, view);
            }
            case 2 -> {
                model.executeOptionTwo();
                filterOption(view.getOption(), model, view);
            }
            case 0 -> view.getOutput(Constants.CLOSE_APP_MSG);
            default -> {
                view.getOutput(Constants.WRONG_OPTION_MSG);
                filterOption(view.getOption(), model, view);
            }
        }
    }
}
