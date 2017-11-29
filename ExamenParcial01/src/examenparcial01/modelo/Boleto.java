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
public class Boleto {
    
    private String nAsiento;
    private double costo;
    private Asistente asis;
    private Festival fest;

    public Boleto(String nAsiento, double costo, Asistente asis, Festival fest) {
        this.nAsiento = nAsiento;
        this.costo = costo;
        this.asis = asis;
        this.fest = fest;
    }

    public String getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(String nAsiento) {
        this.nAsiento = nAsiento;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Asistente getAsis() {
        return asis;
    }

    public void setAsis(Asistente asis) {
        this.asis = asis;
    }

    public Festival getFest() {
        return fest;
    }

    public void setFest(Festival fest) {
        this.fest = fest;
    }

    @Override
    public String toString() {
        return "Boleto{" + "nAsiento=" + nAsiento + ", costo=" + costo + ", asis=" + asis + ", fest=" + fest + '}';
    }
    
    
    
}
