package mediaplayer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebView;

public class PlayerVideo implements Initializable{

    @FXML
    private WebView playervideo;

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.playervideo.getEngine().load("https://www.youtube.com/embed/UmnxcjRk37Q");
    }
    @FXML
    void btnBackClicked(ActionEvent event) {
        try {
            App.setRoot("PlayerController");
            playervideo.getEngine().load(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
