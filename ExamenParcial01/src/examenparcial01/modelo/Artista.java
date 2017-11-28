/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.modelo;

/**
 *
 * @author User
 */
class Artista extends Persona {
    
    private Persona datos;

    public Artista(Persona datos, String nombre, String apellido, String fechaNac) {
        super(nombre, apellido, fechaNac);
        this.datos = datos;
    }

   

    public Persona getDatos() {
        return datos;
    }

    public void setDatos(Persona datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "Artista{" + "datos=" + datos + '}';
    }
    
    
}
