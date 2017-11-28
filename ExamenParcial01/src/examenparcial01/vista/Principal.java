package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;

public class Principal {

    public static void main(String[] args) {
        GestionDato gD=new GestionDato();
        
        VentanaPrincipal ventana=new VentanaPrincipal("Festival", gD);
        
       
    }
    
}
