package mediaplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mediaplayer.request.*;

import java.io.IOException;
import java.io.StringReader;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException, JAXBException {
        //RICHIESTA AL SERVER
        HttpHandler http = new HttpHandler();
        StringBuilder response = new StringBuilder();

        response = http.httpRequest("GET", "http://192.168.0.11/php/films_request.php");
        
        //ELABORAZIONE DELLA RICHIESTA CON JAXB
        JAXBContext jaxbContext = JAXBContext.newInstance(ArrayFilms.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        ArrayFilms arrayfilms = new ArrayFilms();
        arrayfilms = (ArrayFilms) unmarshaller.unmarshal(new StringReader(response.toString()));

        SchedaVideoController url = new SchedaVideoController();

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

            url.setImageUrl(copertina);
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