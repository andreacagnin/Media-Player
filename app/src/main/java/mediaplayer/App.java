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

    @Override
    public void start(Stage stage) throws IOException, JAXBException {
        this.stage = stage;
        root = new Group();

        //RICHIESTA AL SERVER
        request = new Request();
        response = request.sendRequest("GET", new DotEnv().get("SERVER") + "/php/films_request.php").toString();
        
        //ELABORAZIONE DELLA RICHIESTA CON JAXB
        JAXBContext jaxbContext = JAXBContext.newInstance(ArrayFilms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        arrayfilms = new ArrayFilms();
        arrayfilms = (ArrayFilms) unmarshaller.unmarshal(new StringReader(response));

        //CARICAMENTO SCHERMATA HOME CON GLI HEADER DEI FILM
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SchedaVideoController.fxml"));
        Parent root = loader.load();

        controller = loader.getController();
        controller.setImage(new DotEnv().get("SERVER") + "/media/copertine/be_good.jpg");
        controller.setApp(this);
        controller.setButtons();

        //ELIMINARE IL -1 DOPO
        for(int i = 0; i < controller.getButtons().size()-1; i++){
            controller.getButton(i).setId("" + arrayfilms.getFilm(i).getID());
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
        
        JAXBContext jaxbContext = JAXBContext.newInstance(ArrayFilms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        arrayfilms = new ArrayFilms();
        arrayfilms = (ArrayFilms) unmarshaller.unmarshal(new StringReader(response));

        PlayerVideo controller2 = loader.getController();
        controller2.setVideo(arrayfilms.getFilm(Integer.parseInt(id)-1).getFilm());

        scene = new Scene(root);
        stage.setScene(scene);
    }

}