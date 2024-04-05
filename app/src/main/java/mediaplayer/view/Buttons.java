package mediaplayer.view;

import java.io.*;
import javafx.scene.control.*;
import javafx.scene.image.*;

public class Buttons {
    
    public Buttons(){}

    public Button createButton(String url){
        File file = new File(url);
        String localUrl = null;
        try {
            localUrl = file.toURI().toURL().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Image image = new Image(localUrl);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(177);
        imageView.setFitHeight(268);

        Button button = new Button();
        button.setGraphic(imageView);
        button.setOnAction(event -> {
            // Handle button click event here
            System.out.println("Button clicked: " + url);
        });

        return button;
    }
}
