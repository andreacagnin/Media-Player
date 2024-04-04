package mediaplayer.request;

import java.util.*;
import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "film")
@XmlType(propOrder = { 
    "id", 
    "titolo", 
    "copertina",
    "descrizione",
    "durata",
    "data_produzione",
    "paese_produzione",
    "id_regista" 
})
public class Film {
    private int id;
    private String titolo;
    private String copertina;
    private String descrizione;
    private String durata;
    private Date data_produzione;
    private String paese_produzione;
    private int id_regista;

    public Film(){}

    public Film(int id, String titolo, String copertina, String descrizione, String durata, Date data_prod, String paese_prod, int id_regista){
        this.id = id;
        this.titolo = titolo;
        this.copertina = copertina;
        this.descrizione = descrizione;
        this.durata = durata;
        this.data_produzione = data_prod;
        this.paese_produzione = paese_prod;
        this.id_regista = id_regista;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCopertina() {
        return this.copertina;
    }

    public void setCopertina(String copertina) {
        this.copertina = copertina;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDurata() {
        return this.durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public Date getData_produzione() {
        return this.data_produzione;
    }

    public void setData_produzione(Date data_produzione) {
        this.data_produzione = data_produzione;
    }

    public String getPaese_produzione() {
        return this.paese_produzione;
    }

    public void setPaese_produzione(String paese_produzione) {
        this.paese_produzione = paese_produzione;
    }

    public int getId_regista() {
        return this.id_regista;
    }

    public void setId_regista(int id_regista) {
        this.id_regista = id_regista;
    }

}