package mediaplayer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import mediaplayer.env.DotEnv;
import mediaplayer.http.*;
import mediaplayer.request.*;
import mediaplayer.view.*;

import java.io.IOException;
import java.io.StringReader;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Group root;
    private static Scene scene;
    private static Stage stage;

    private SchedaVideoController controller;
    private ArrayFilms arrayfilms;
    private Request request;
    private String response;
    private JAXB jaxb;

    @Override
    public void start(Stage stage) throws IOException, JAXBException {
        this.stage = stage;
        root = new Group();

        //RICHIESTA AL SERVER
        request = new Request();
        response = request.sendRequest("GET", new DotEnv().get("SERVER") + "/php/films_request.php").toString();

        jaxb = new JAXB(ArrayFilms.class);
        arrayfilms = (ArrayFilms) jaxb.unmarshal(response);

        //CARICAMENTO SCHERMATA HOME CON GLI HEADER DEI FILM
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SchedaVideoController.fxml"));
        Parent root = loader.load();

        controller = loader.getController();
        controller.setImage1(new DotEnv().get("SERVER") + "/media/copertine/be_good.jpg");
        controller.setImage2(new DotEnv().get("SERVER") + "/media/copertine/il_buono_il_brutto_il_cattivo.jpg");
        controller.setImage3(new DotEnv().get("SERVER") + "/media/copertine/be_good.jpg");
        controller.setImage4(new DotEnv().get("SERVER") + "/media/copertine/be_good.jpg");
        controller.setImage5(new DotEnv().get("SERVER") + "/media/copertine/be_good.jpg");
        controller.setImage6(new DotEnv().get("SERVER") + "/media/copertine/be_good.jpg");
        controller.setApp(this);
        controller.setButtons();

        //ELIMINARE IL -1 DOPO
        for(int i = 0; i < controller.getButtons().size(); i++){
            controller.getButton(i).setId("" + (arrayfilms.getFilm(i).getID()));
        }

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }

    public static Stage getStage() {
        return stage;
    }
  
    public static void setScene(String fxml) {
        scene.setRoot(new FxmlManager().loadFXML(fxml));
    }
  
    public static void setScene(Scene scene) {
        stage.setScene(scene);
    }
  
    public static void setRoot(Node node) {
        root.getChildren().add(node);
    }
  
    public static Group getRoot() {
        return root;
    }

    public static void main(String[] args) {
        launch();
    }

    public static void setScene2() {
        stage.setScene(scene);
    }

    public void setScene1(String id) throws IOException, JAXBException {
        Scene scene;

        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlayerVideo.fxml"));
        Parent root = loader.load();

        request = new Request();
        response = request.sendRequest("GET", new DotEnv().get("SERVER") + "/php/film_request.php?id_film=" + id).toString();
        
        jaxb = new JAXB(ArrayFilms.class);
        arrayfilms = (ArrayFilms) jaxb.unmarshal(response);

        System.out.println("\n\n" + arrayfilms.getFilms().size());

        PlayerVideo controller2 = loader.getController();
        controller2.setVideo(arrayfilms.getFilm(0).getFilm());

        //DATI DEL FILM DA MOSTRARE
        arrayfilms.getFilm(0).getTitolo();
        arrayfilms.getFilm(0).getDescrizione();
        arrayfilms.getFilm(0).getDurata();
        arrayfilms.getFilm(0).getData_produzione();
        arrayfilms.getFilm(0).getPaese_produzione();
        arrayfilms.getFilm(0).getnomeRegista();
        arrayfilms.getFilm(0).getcognomeRegista();

        scene = new Scene(root);
        stage.setScene(scene);
    }

}