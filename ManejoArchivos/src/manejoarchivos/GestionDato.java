/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GestionDato {
    private List<Persona> personaList;
    private File datoPersona;

    public GestionDato(List<Persona> personaList) {
        this.personaList = personaList;
      
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }

    public File getDatoPersona() {
        return datoPersona;
    }

    public void setDatoPersona(File datoPersona) {
        this.datoPersona = datoPersona;
    }
    
    public boolean persistirPersonaList(List<Persona> lista){
        boolean retorno=false;
        try {
            FileWriter ae= new FileWriter("c:/raiz//archivoPersona.txt", true);
            BufferedWriter escritura= new BufferedWriter(ae);
            for (Persona persona : lista) {
                escritura.append(persona.toString());
                escritura.newLine();
            }
            escritura.close();
            retorno=true;
            return retorno;
        } catch (IOException e1) {
            System.out.println("El Archivo NO Existe");
            retorno=false;
        }
        
        return retorno;
    }
    
    public List<Persona> leerPersona(){
      
        try {
            FileReader ae= new FileReader("c://raiz//archivoPersona.txt");
            BufferedReader escritura= new BufferedReader(ae);
            String linea=escritura.readLine();
            
            while (linea!=null) {  
                linea= leerPersona().toString();
                int c = Integer.parseInt();
                String n;
                int e;
                
                Persona p = new Persona(c, n, e);
                this.personaList.add(p);
            }
            escritura.close();
           
        } catch (IOException e1) {
            System.out.println("El Archivo NO Existe");
            
        }
        
        return this.personaList;
    }
    
    public boolean addPersona(Persona p){
        return this.addPersona(p);
    } 
}
