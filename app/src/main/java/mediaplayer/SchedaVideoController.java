package mediaplayer;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.*;

public class SchedaVideoController {

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView2;

    @FXML
    private ImageView imageView3;

    // This method can be called from somewhere, like initialization, to set images
    public void initialize() {
        // Set image for imageView1
        Image image1 = new Image("http://localhost/media/copertine/be_good.jpg");
        imageView1.setImage(image1);

        // Set image for imageView2
        Image image2 = new Image("http://localhost/media/copertine/be_good.jpg");
        imageView2.setImage(image2);

        // Set image for imageView3
        Image image3 = new Image("http://localhost/media/copertine/be_good.jpg");
        imageView3.setImage(image3);
    }

    @FXML
    void btnBackClicked(ActionEvent event) throws IOException {
        App.setRoot("PlayerVideo");
    }

    

}
