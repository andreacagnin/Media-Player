module mediaplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires jakarta.xml.bind;

    opens mediaplayer to javafx.fxml;
    exports mediaplayer;
}
