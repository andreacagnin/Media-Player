package mediaplayer;


import java.io.IOException;
import java.util.ArrayList;

import jakarta.xml.bind.JAXBException;
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
    private ImageView imageView4;
    @FXML
    private ImageView imageView5;
    @FXML
    private ImageView imageView6;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;

    private App app;
    private ArrayList<Button> buttons;

    public SchedaVideoController(){
        buttons = new ArrayList<Button>();
    }

    // This method can be called from somewhere, like initialization, to set images
    public void setImage1(String url) {
        Image image1 = new Image(url);
        imageView1.setImage(image1);
    }
    public void setImage2(String url) {
        Image image2 = new Image(url);
        imageView2.setImage(image2);
    }
    public void setImage3(String url) {
        Image image3 = new Image(url);
        imageView3.setImage(image3);
    }
    public void setImage4(String url) {
        Image image4 = new Image(url);
        imageView4.setImage(image4);
    }
    public void setImage5(String url) {
        Image image5 = new Image(url);
        imageView5.setImage(image5);
    }
    public void setImage6(String url) {
        Image image6 = new Image(url);
        imageView6.setImage(image6);
    }

       


    public void setApp(App app){
        this.app = app;
    }

    public void setButtons(){
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
    }

    public ArrayList<Button> getButtons(){
        return buttons;
    }

    @SuppressWarnings("exports")
    public Button getButton(int i){
        return buttons.get(i);
    }

    @FXML
    void btnOKClicked(ActionEvent event) throws IOException, JAXBException {
        for(int i = 0; i < buttons.size(); i++){
            if(buttons.get(i) == event.getTarget()){
                app.setScene1(buttons.get(i).getId());
            }
        }
        
    }

}
