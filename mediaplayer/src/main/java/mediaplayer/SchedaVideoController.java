package mediaplayer;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class SchedaVideoController {
    @FXML
    void btnOKClicked(ActionEvent event) {
      
        try 
        {
            App.setRoot("PlayerVideo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
