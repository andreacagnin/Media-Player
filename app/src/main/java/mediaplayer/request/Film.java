package mediaplayer.request;

import java.util.*;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "film")
public class Film {
    private int id_film;
    private String film;
    private String titolo;
    private String copertina;
    private String descrizione;
    private String durata;
    private Date data_produzione;
    private String paese_produzione;
    private int id_regista;

    public Film(){}

    @XmlElement(name = "id_film")
    public int getID() {
        return this.id_film;
    }

    public void setID(int id) {
        this.id_film = id;
    }

    @XmlElement(name = "film")
    public String getFilm(){
        return this.film;
    }

    public void setFilm(String film){
        
        this.film = film;
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

    @XmlElement(name = "descrizione")
    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @XmlElement(name = "durata")
    public String getDurata() {
        return this.durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    @XmlElement(name = "data_produzione")
    public Date getData_produzione() {
        return this.data_produzione;
    }

    public void setData_produzione(Date data_produzione) {
        this.data_produzione = data_produzione;
    }

    @XmlElement(name = "paese_produzione")
    public String getPaese_produzione() {
        return this.paese_produzione;
    }

    public void setPaese_produzione(String paese_produzione) {
        this.paese_produzione = paese_produzione;
    }

    @XmlElement(name = "id_regista")
    public int getId_regista() {
        return this.id_regista;
    }

    public void setId_regista(int id_regista) {
        this.id_regista = id_regista;
    }

}