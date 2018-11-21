/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraOrdenador;
import shs.Peticiones;
/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Ordenador {

    Cpu cpu;
    Rato rato;
    Teclado teclado;
    Monitor monitor;

    public Ordenador(Cpu cpu, Rato rato, Teclado teclado, Monitor monitor) {
        this.cpu = cpu;
        this.rato = rato;
        this.teclado = teclado;
        this.monitor = monitor;
    }

    public Ordenador() {
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Rato getRato() {
        return rato;
    }

    public void setRato(Rato rato) {
        this.rato = rato;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "cpu=" + cpu + ", rato=" + rato + ", teclado=" + teclado + ", monitor=" + monitor + '}';
    }

}
