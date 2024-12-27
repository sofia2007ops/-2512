module ru.bashmakova.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.pagetopage to javafx.fxml;
    exports ru.bashmakova.pagetopage;
    exports ru.bashmakova.pagetopage.controller;
    opens ru.bashmakova.pagetopage.controller to javafx.fxml;
}