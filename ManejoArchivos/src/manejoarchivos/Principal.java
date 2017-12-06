/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persona> personaList = new ArrayList();
        List<Auto> autoList = new ArrayList();
        personaList.add(new Persona (123,"Pablin Mallin",19));
        personaList.add(new Persona (124,"Lius Cirnejo",23));
        personaList.add(new Persona (123,"Sandro Quintunia",27));
        
        autoList.add(new Auto("ABC123", "Toyota",personaList.get(0)));
        autoList.add(new Auto("BCD123", "Chevroleth", personaList.get(1)));
        autoList.add(new Auto("AWR153", "Mazda", personaList.get(2)));
        
        
     
        
        GestionDato gD= new GestionDato(personaList,autoList);
        gD.persistirPersonaList(personaList);
        gD.leerPersona();
        
        gD.persistirArchivoAuto(autoList);
        
        System.out.println(personaList.size());
      
        
        
    }
    
}
