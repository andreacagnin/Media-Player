package mediaplayer.request;

import java.util.ArrayList;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "films")
public class ArrayFilms {
    private ArrayList<Film> films;
    
    public ArrayFilms(){
        films = new ArrayList<Film>();
    }

    @XmlElement(name = "film")
    public ArrayList<Film> getFilms() {
        return films;
    }

    public Film getFilm(int i){
        return films.get(i);
    }

    public String getCopertina(int i){
        return films.get(i).getCopertina();
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }
}
