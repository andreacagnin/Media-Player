module mediaplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens mediaplayer to javafx.fxml;
    exports mediaplayer;
}
