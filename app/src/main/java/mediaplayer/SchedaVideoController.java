package mediaplayer;


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
    public void setImage(String url) {
        // Set image for imageView1
        System.out.println(url);
        Image image1 = new Image(url);
        imageView1.setImage(image1);

        // Set image for imageView2
        Image image2 = new Image(url);
        imageView2.setImage(image2);

        // Set image for imageView3
        Image image3 = new Image(url);
        imageView3.setImage(image3);
    }

    @FXML
    private void btnOKClicked(ActionEvent event) {
        
        App.setScene("PlayerVideo");
        
    }

    

    

}
