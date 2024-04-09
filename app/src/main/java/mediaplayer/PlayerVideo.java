package mediaplayer;

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
        
            App.setScene2();
            playervideo.getEngine().load(null);
    }

}
