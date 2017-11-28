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
class Asistente extends Persona {
    
    private Boleto datosB;

    public Asistente(Boleto datosB, String nombre, String apellido, String fechaNac) {
        super(nombre, apellido, fechaNac);
        this.datosB = datosB;
    }

   

    
   

    public Boleto getDatosB() {
        return datosB;
    }

    public void setDatosB(Boleto datosB) {
        this.datosB = datosB;
    }

    
   
    
}
