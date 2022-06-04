package FilmEksamen;

import java.time.LocalDate;

public class Film {
    Producer producer = new Producer();
    String filmtitel;
    int udgivelsesÅr;

    public Film(String filmtitel,int udgivelsesÅr){
        this.filmtitel=filmtitel;
        this.udgivelsesÅr=udgivelsesÅr;
    }
    public Film(String filmtitel){
        this.filmtitel=filmtitel;
        this.udgivelsesÅr= LocalDate.now().getYear();

    }
}
