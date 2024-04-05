package mediaplayer;


import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.layout.VBox;

public class SchedaVideoController {


    @FXML
    private VBox buttonContainer;

    private ArrayList<String> imageUrls;
    
    public SchedaVideoController(){
        imageUrls = new ArrayList<String>();
    }

    public void setImageUrl(String url){
        imageUrls.add(url);
        Button button = createButton(url);
        buttonContainer.getChildren().add(button);
    }

    private Button createButton(String imageUrl) {
        System.out.println(imageUrl);
        Image image = new Image(this.getClass().getResourceAsStream(imageUrl));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(177);
        imageView.setFitHeight(268);

        Button button = new Button();
        button.setGraphic(imageView);
        button.setOnAction(event -> {
            // Handle button click event here
            System.out.println("Button clicked: " + imageUrl);
        });

        return button;
    }







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
