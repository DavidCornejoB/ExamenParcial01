/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.List;

/**
 *
 * @author User
 */
public class Lista<T> {
    
    private Nodo cima;

    public Lista() {
    }
    
    public Lista(Nodo cima) {
        this.cima = null;
    }
    public boolean pilaVacia(){
        if (cima==null) {
            return true;
        }
        return false;
    }
    public void insertar(Object elemento){
        Nodo nodo= new Nodo(elemento);
        nodo.setSiguiente(cima);
        cima=nodo;
    }
    public Object quitar()throws Exception{
        if (pilaVacia()) {
            throw new Exception("Error: Lista Vacia");
        }
        Object punta= cima.getElemento();
        cima= cima.getSiguiente();   
        return punta;
    }
    public void mostrar(){
         Nodo nodo = cima;
         
        while (nodo.getSiguiente() != null) {
            System.out.println(" | " + nodo.getElemento()+" | ");
            nodo = nodo.getSiguiente();
        }
       
        System.out.print(" | " + nodo.getElemento());
    }
    public Object mostrarDato()throws Exception{
        if (pilaVacia()) {
            throw new Exception("Error: Pila Vacia");
        }
        return cima.getElemento();
    }
     public void limpiar(){
         System.out.println("La Pila a sido limpiada");
         cima=null;
     }
    
    

}
