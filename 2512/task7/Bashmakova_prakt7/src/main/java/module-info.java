module ru.bashmakova.bashmakova_prakt7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bashmakova.bashmakova_prakt7 to javafx.fxml;
    exports ru.bashmakova.bashmakova_prakt7;
    exports ru.bashmakova.bashmakova_prakt7.controller;
    opens ru.bashmakova.bashmakova_prakt7.controller to javafx.fxml;
}