package examenparcial01.controlador;

import examenparcial01.vista.VentanaArtista;
import examenparcial01.vista.VentanaAsistente;
import examenparcial01.vista.VentanaBoleto;
import examenparcial01.vista.VentanaFestival;
import examenparcial01.vista.VentanaPresentacion;
import examenparcial01.vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoPrincipal implements ActionListener{
    
    private VentanaPrincipal ventanaPrincipal;

    public EventoPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ventanaPrincipal.getMenuItemList().get(0))){
            VentanaFestival vFestival = new VentanaFestival("Festival", this.ventanaPrincipal.getgD());
            vFestival.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vFestival);
        }
        
        if(e.getSource().equals(ventanaPrincipal.getMenuItemList().get(1))){
            VentanaAsistente vAsistente=new VentanaAsistente("Asistente", this.ventanaPrincipal.getgD());
            vAsistente.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(vAsistente);
        }
        
        if(e.getSource().equals(ventanaPrincipal.getMenuItemList().get(2))){
            VentanaArtista ventana=new VentanaArtista("Artista", this.ventanaPrincipal.getgD());
            ventana.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(ventana);
        }
        
        if(e.getSource().equals(ventanaPrincipal.getMenuItemList().get(3))){
            VentanaPresentacion ventana=new VentanaPresentacion("Presentacion Artista", this.ventanaPrincipal.getgD());
            ventana.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(ventana);
        }
        
        if(e.getSource().equals(ventanaPrincipal.getMenuItemList().get(4))){
            VentanaBoleto ventana=new VentanaBoleto("Boleto-Asistente", this.ventanaPrincipal.getgD());
            ventana.setVisible(true);
            this.ventanaPrincipal.getEscritorio().add(ventana);
        }
    }
    
}
