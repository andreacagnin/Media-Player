package mediaplayer;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class SchedaVideoController {
   // private HttpHandler http = new HttpHandler();
    @FXML
    void btnOKClicked(ActionEvent event) {
      
        try {
            App.setRoot("PlayerVideo");
            //http.sendGetRequest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
