/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author User
 */
public class Nodo<T> {
     private T elemento;
    private Nodo siguiente;

    public Nodo() {
    }
 
    public Nodo(T elemento) {
        this.elemento = elemento;
        this.siguiente=null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}