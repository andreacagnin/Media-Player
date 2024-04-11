package mediaplayer;


import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.*;

public class SchedaVideoController{

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView2;

    @FXML
    private ImageView imageView3;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    private App app;
    private ArrayList<Button> buttons;

    public SchedaVideoController(){
        buttons = new ArrayList<Button>();
    }

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

    public void setApp(App app){
        this.app = app;
    }

    public void setButtons(){
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
    }

    public ArrayList<Button> getButtons(){
        return buttons;
    }

    @SuppressWarnings("exports")
    public Button getButton(int i){
        System.out.println(buttons.get(i).getOnAction().toString() + "mao");
        return buttons.get(i);
    }

    public void setId(String id){
        this.button1.setId(id);
    }

    @FXML
    void btnOKClicked(ActionEvent event) throws IOException {
        app.setScene1();
    }

}
