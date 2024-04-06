package mediaplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;
import mediaplayer.env.DotEnv;
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

        response = http.httpRequest("GET", new DotEnv().get("SERVER") + "/php/films_request.php");
        
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
        scene = new Scene(loadFXML("SchedaVideoController"));
        stage.setScene(scene);
        stage.show();

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}