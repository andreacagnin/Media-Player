package mediaplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SchedaVideoController {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    public void initialize() {
        // Load images
        Image image1 = new Image(getClass().getResourceAsStream("C:\\xampp\\htdocs\\media\\copertine\\be_good.jpg"));
        Image image2 = new Image(getClass().getResourceAsStream("C:\\xampp\\htdocs\\media\\copertine\\be_good.jpg"));
        Image image3 = new Image(getClass().getResourceAsStream("C:\\xampp\\htdocs\\media\\copertine\\be_good.jpg"));

        // Set images on buttons
        button1.setGraphic(new ImageView(image1));
        button2.setGraphic(new ImageView(image2));
        button3.setGraphic(new ImageView(image3));
    }
}
