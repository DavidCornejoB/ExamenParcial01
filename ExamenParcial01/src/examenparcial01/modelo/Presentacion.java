package examenparcial01.modelo;

public class Presentacion {
    
    private Festival fest;
    private Artista artista;
    private int numeroPres;

    public Presentacion(Festival fest, Artista artista, int numeroPres) {
        this.fest = fest;
        this.artista = artista;
        this.numeroPres = numeroPres;
    }

    public Festival getFest() {
        return fest;
    }

    public void setFest(Festival fest) {
        this.fest = fest;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getNumeroPres() {
        return numeroPres;
    }

    public void setNumeroPres(int numeroPres) {
        this.numeroPres = numeroPres;
    }

    @Override
    public String toString() {
        return "Presentacion{" + "fest=" + fest + ", artista=" + artista + ", numeroPres=" + numeroPres + '}';
    }
    
    
    
}
