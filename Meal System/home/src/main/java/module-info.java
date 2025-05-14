module meal.system {
    requires javafx.controls;
    requires javafx.fxml;

    opens meal.system to javafx.fxml;
    exports meal.system;
    exports meal.system.User.AdministratorController;
    opens meal.system.User.AdministratorController to javafx.fxml;
}
