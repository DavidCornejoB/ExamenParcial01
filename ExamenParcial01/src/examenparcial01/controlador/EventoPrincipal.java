/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.vista.VentanaFestival;
import examenparcial01.vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jorge Pizarro
 */
public class EventoPrincipal implements ActionListener{
    
    VentanaPrincipal vPrincipal;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vPrincipal.getMenuItemList().get(0))){
            VentanaFestival vFestival = new VentanaFestival();
        }
        
        if(e.getSource().equals(vPrincipal.getMenuItemList().get(1))){
            
        }
        
        if(e.getSource().equals(vPrincipal.getMenuItemList().get(2))){
            
        }
        
        if(e.getSource().equals(vPrincipal.getMenuItemList().get(3))){
            
        }
        
        
        
    }
    
}
