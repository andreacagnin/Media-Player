package mediaplayer;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebView;

public class PlayerVideo{

    @FXML
    private WebView playervideo;

    public void setVideo(String url) {
        this.playervideo.getEngine().load(url);
    }
    
    @FXML
    void btnBackClicked(ActionEvent event) {
        
            App.setScene2();
            playervideo.getEngine().load(null);
    }

}
