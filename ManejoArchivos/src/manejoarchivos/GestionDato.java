/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
            FileOutputStream ae= new FileOutputStream("C:/raiz/archivo.txt", true);
             DataOutputStream escritura= new DataOutputStream (ae);
             
            for (Persona persona : lista) {
                
                escritura.writeByte(persona.getCodigo());
                escritura.writeUTF(persona.getNombre());
                escritura.writeByte(persona.getEdad());
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
            FileReader fr = new FileReader("C:/raiz/archivo.txt");
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
    
    public boolean leerPersona(){
      
        try {
            FileInputStream ae= new FileInputStream("C:/raiz/archivo.txt");
            DataInputStream escritura= new DataInputStream (ae);
            
            while (true) {  

                
                int c = escritura.readByte();
                String n= escritura.readUTF();
                int e= escritura.readByte();
                
                Persona p = new Persona(c, n, e);
                this.personaList.add(p);

            }
        
        } catch (IOException e1) {
            JOptionPane.showMessageDialog(null, "Error", "El archivo no existe", JOptionPane.ERROR_MESSAGE);
            return false;
        }

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
