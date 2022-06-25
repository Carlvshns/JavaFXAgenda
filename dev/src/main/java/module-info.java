module carl {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens carl to javafx.fxml;
    opens carl.controller to javafx.fxml;
    exports carl;
    exports carl.controller;
}
