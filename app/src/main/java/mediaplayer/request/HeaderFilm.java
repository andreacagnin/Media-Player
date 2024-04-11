package mediaplayer.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "film")
public class HeaderFilm {
    private String id_film;
    private String titolo;
    private String copertina;

    public HeaderFilm(){ }
    
    @XmlElement(name = "id_film")
    public String getID(){
        return id_film;
    }

    public void setID(String id_film){
        this.id_film = id_film;
    }

    @XmlElement(name = "titolo")
    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @XmlElement(name = "copertina")
    public String getCopertina() {
        return this.copertina;
    }

    public void setCopertina(String copertina) {
        this.copertina = copertina;
    }

}
