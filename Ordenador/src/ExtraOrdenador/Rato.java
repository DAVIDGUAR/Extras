/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraOrdenador;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Rato {
    boolean inhalambrico;
    String modelo;

    public Rato() {
    }

    public Rato(boolean inhalambrico, String modelo) {
        this.inhalambrico = inhalambrico;
        this.modelo = modelo;
    }

    public boolean isInhalambrico() {
        return inhalambrico;
    }

    public void setInhalambrico(boolean inhalambrico) {
        this.inhalambrico = inhalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Rato{" + "inhalambrico=" + inhalambrico + ", modelo=" + modelo + '}';
    }
    
}
