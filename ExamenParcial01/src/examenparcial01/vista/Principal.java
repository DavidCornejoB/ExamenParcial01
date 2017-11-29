package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.Festival;
import examenparcial01.modelo.Presentacion;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        List<Artista> artistaList = new ArrayList();
        List<Asistente> asistenteList = new ArrayList();
        List<Boleto> boletoList = new ArrayList();
        List<Festival> festivalList = new ArrayList();
        List<Presentacion> presentacionList = new ArrayList();
        GestionDato gD=new GestionDato(artistaList, asistenteList, boletoList, festivalList, presentacionList);
        
        VentanaPrincipal ventana=new VentanaPrincipal("Festival", gD);
        
       
    }
    
}
