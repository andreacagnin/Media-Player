package mediaplayer.request;

import java.util.ArrayList;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "Films")
public class ArrayFilms {
    private ArrayList<HeaderFilm> films;
    
    public ArrayFilms(){
        films = new ArrayList<HeaderFilm>();
    }

    @XmlElement(name = "film")
    public ArrayList<HeaderFilm> getFilms() {
        return films;
    }

    public HeaderFilm getFilm(int i){
        return films.get(i);
    }

    public void setFilms(ArrayList<HeaderFilm> films) {
        this.films = films;
    }
}
