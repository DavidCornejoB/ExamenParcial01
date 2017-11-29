/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.vista.VentanaArtista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Pizarro
 */
public class EventoArtista implements ActionListener{

    VentanaArtista vArtista; 

    public EventoArtista(VentanaArtista vArtista) {
        this.vArtista = vArtista;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vArtista.getBotonList().get(0))){
            if(this.validarDatosVacios()){
                JOptionPane.showMessageDialog(null, "Existen datos por llenar", "Guardar Artista", JOptionPane.ERROR_MESSAGE);
            }else{
                String nombre = this.vArtista.getTextoList().get(0).getText();
                String apellido = this.vArtista.getTextoList().get(1).getText();
                String fechaNac = this.vArtista.getTextoList().get(2).getText();
                Artista artista = new Artista(nombre, apellido, fechaNac);
                if(this.vArtista.getgD().addArtista(artista)){
                    int f = this.vArtista.getgD().getArtistaList().size();
                    int c = this.vArtista.getEncabezado().length;
                    Object datos[][] = this.vArtista.cargarDatos(f, c);
                    this.vArtista.getModeloTabla().setDataVector(datos, this.vArtista.getEncabezado());
                    
                    for(int i = 0 ; i < this.vArtista.getTextoList().size() ; i ++){
                        this.vArtista.getTextoList().get(i).setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar Artista!!","Guardar Artista", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        if(e.getSource().equals(this.vArtista.getBotonList().get(1))){
            try {
                this.vArtista.setClosed(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(EventoArtista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public boolean validarDatosVacios(){
        for(int i = 0 ; i < this.vArtista.getTextoList().size();i++){
            if(this.vArtista.getTextoList().get(0).getText().isEmpty())
                return true;
        }
        return false;
    }
    
}
