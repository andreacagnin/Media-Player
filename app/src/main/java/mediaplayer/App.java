package mediaplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;
import mediaplayer.http.HttpHandler;
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

    @Override
    public void start(Stage x) throws IOException, JAXBException {

        root = new Group();
        scene = new Scene(root);
        stage = new Stage();

        //RICHIESTA AL SERVER
        HttpHandler http = new HttpHandler();
        StringBuilder response = new StringBuilder();

        response = http.httpRequest("GET", "http://192.168.0.11/php/films_request.php");
        
        //ELABORAZIONE DELLA RICHIESTA CON JAXB
        JAXBContext jaxbContext = JAXBContext.newInstance(ArrayFilms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        ArrayFilms arrayfilms = new ArrayFilms();
        arrayfilms = (ArrayFilms) unmarshaller.unmarshal(new StringReader(response.toString()));

        int ID;
        String titolo, copertina;
        for (HeaderFilm films : arrayfilms.getFilms()) {
            ID = films.getID();
            System.out.println(ID);

            titolo = films.getTitolo();
            System.out.println(titolo);

            copertina = films.getCopertina();
            System.out.println(copertina);
            System.out.println();

        }

        //CARICAMENTO SCHERMATA HOME CON GLI HEADER DEI FILM
        scene = new Scene(new FxmlManager().loadFXML("SchedaVideoController"));
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

}