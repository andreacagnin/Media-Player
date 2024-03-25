module mediaplayer {
    requires javafx.controls;
    requires javafx.fxml;

    opens mediaplayer to javafx.fxml;
    exports mediaplayer;
}
