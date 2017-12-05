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
        //personaList.add(new Persona (123,"Pablo Malla",19));
        //personaList.add(new Persona (124,"David Cornejo",23));
        //personaList.add(new Persona (123,"Maria Sanchez",27));
        
       
        
        GestionDato gD= new GestionDato(personaList);
        //gD.persistirPersonaList(personaList);
        personaList=gD.leerPersona();
        
        System.out.println(personaList.size());
      
        
        
    }
    
}
