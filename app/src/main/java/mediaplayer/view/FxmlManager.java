package mediaplayer.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import mediaplayer.App;

public class FxmlManager {
    private FXMLLoader fx;

    public Parent loadFXML(String fxml) {
      try {
         fx = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
         return fx.load();
      } catch (IOException e) {}
      return null;
   }
}
