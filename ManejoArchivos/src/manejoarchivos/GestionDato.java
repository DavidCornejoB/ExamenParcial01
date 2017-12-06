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
     private List<Auto> autoList;
    private File datoPersona;
    private String[] partes;

    public GestionDato(List<Persona> personaList, List<Auto> autoList) {
        this.personaList = personaList;
        this.autoList = autoList;
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

    public List<Auto> getAutoList() {
        return autoList;
    }

    public void setAutoList(List<Auto> autoList) {
        this.autoList = autoList;
    }
    
     public boolean addPersona(Persona p){
        return this.addPersona(p);
    } 
    
    public boolean addAuto(Auto a) {
        return this.autoList.add(a);
    }

    
    public boolean persistirPersonaList(List<Persona> lista){
        boolean retorno=false;
        try {
            FileWriter ae= new FileWriter("c:/raiz//archivo.txt", true);
            BufferedWriter escritura= new BufferedWriter(ae);
            for (Persona persona : lista) {
                escritura.append(persona.toString());
                escritura.newLine();
            }
            escritura.close();
            retorno=true;
            return retorno;
        } catch (IOException e1) {
            System.out.println("El Archivo NOOOO Existe");
            retorno=false;
        }
        
        return retorno;
    }
    public List<Auto> leerAuto() {
        try {
            FileReader fr = new FileReader("c:/raiz//archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            
            
            while(linea!=null){
               partes=linea.split(" | ");
                String parte1 = partes[0];
                String parte3 = partes[2];
                String parte4 = partes[3];
                String parte6 = partes[5]; 
               
                
                System.out.println(parte1);
                
            } 
            br.close();
            

        } catch (IOException ae) {
        }
        return this.autoList;
    }
    
    public List<Persona> leerPersona(){
      
        try {
            FileReader ae= new FileReader("c://raiz//archivo.txt");
            BufferedReader escritura= new BufferedReader(ae);
            String linea=escritura.readLine();
            
            while (linea!=null) {  
                
                partes = linea.split(" | ");
                String parte1 = partes[0];
                String parte3 = partes[2];
                String parte4 = partes[3];
                String parte6 = partes[5];
                
                int c = Integer.parseInt(parte1);
                String n= parte3 + parte4 ;
                int e= Integer.parseInt(parte6);
                
                Persona p = new Persona(c, n, e);
                this.personaList.add(p);
                linea=escritura.readLine();
            }
            escritura.close();
           
        } catch (IOException e1) {
            System.out.println("El Archivo NOOOOhj Existe");
            
        }
        
        return this.personaList;
    }
     public boolean persistirArchivoAuto(List<Auto> lista) {
        try {

            FileWriter ae = new FileWriter("c:/raiz//archivo.txt", true);

            BufferedWriter escritura = new BufferedWriter(ae);
            for (Auto a : this.autoList) {
                escritura.append(a.toString());
                escritura.newLine();
            }
            escritura.close();
            return true;
        } catch (IOException e1) {
             System.out.println("El Archivo NO Existe");
            return false;
        }
     }   

       
    
    
   
}
