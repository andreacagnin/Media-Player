package mediaplayer;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

public class PlayerVideo{

    @FXML
    private WebView playervideo;
    @FXML
    private TextArea trama;
    @FXML
    private TextField regista;
    @FXML
    private TextField paese;
    @FXML
    private TextField anno;
    @FXML
    private TextField durata;

    public PlayerVideo() {
        trama = new TextArea();
        regista = new TextField();
        paese = new TextField();
        anno = new TextField();
        durata = new TextField();
    }
    public void setVideo(String url) {
        this.playervideo.getEngine().load(url);
    }
    public void setInfo(String trama1, String regista1, String paese1, String date, String durata1) {
        this.trama.setText(trama1);
        this.regista.setText(regista1);
        this.paese.setText(paese1);
        this.anno.setPromptText(date);
        this.durata.setText(durata1);

    }
    
    @FXML
    void btnBackClicked(ActionEvent event) {
        
            App.setScene2();
            playervideo.getEngine().load(null);
    }

}
