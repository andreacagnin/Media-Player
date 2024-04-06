module mediaplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires jakarta.xml.bind;
    requires javafx.graphics;
    requires javafx.base;

    opens mediaplayer to javafx.fxml;
    opens mediaplayer.request to jakarta.xml.bind;
    exports mediaplayer;
}
