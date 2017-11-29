/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Festival;
import examenparcial01.vista.VentanaFestival;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author Jorge Pizarro
 */
public class EventoFestival implements ActionListener{

    VentanaFestival vFestival;

    public EventoFestival(VentanaFestival vFestival) {
        this.vFestival = vFestival;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vFestival.getBotonList().get(0))){
            if(this.validarDatosVacios()){    
                JOptionPane.showMessageDialog(null, "Existen datos por llenar!!","Guardar Festival", JOptionPane.ERROR_MESSAGE);
            }else{
                String nombre = this.vFestival.getTextoList().get(0).getText();
                String fecha  = this.vFestival.getTextoList().get(1).getText();
                String lugar = this.vFestival.getTextoList().get(2).getText();
                Festival f = new Festival(nombre, fecha, lugar);
                
            }
        }
        
        if(e.getSource().equals(this.vFestival.getBotonList().get(1))){
            
        }
    }
    
    public boolean validarDatosVacios(){
        for(int i = 0 ; i < this.vFestival.getTextoList().size();i++){
            if(this.vFestival.getTextoList().get(0).getText().isEmpty())
                return true;
        }
        return false;
    }
    
}
