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
class Asistente {
    private Persona datos;
    private Boleto datosB;

    public Asistente(Persona datos, Boleto datosB) {
        this.datos = datos;
        this.datosB = datosB;
    }

    public Persona getDatos() {
        return datos;
    }

    public void setDatos(Persona datos) {
        this.datos = datos;
    }

    public Boleto getDatosB() {
        return datosB;
    }

    public void setDatosB(Boleto datosB) {
        this.datosB = datosB;
    }

    @Override
    public String toString() {
        return "Asistente{" + "datos=" + datos + ", datosB=" + datosB + '}';
    }
    
    
}
