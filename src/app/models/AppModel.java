package app.models;

import app.contollers.OrderAController;
import app.contollers.OrderBController;

public class AppModel {

    public void executeOptionOne() {
        OrderAController controller = new OrderAController();
        controller.handleData();
    }

    public void executeOptionTwo() {
        OrderBController controller = new OrderBController();
        controller.handleData();
    }

}
