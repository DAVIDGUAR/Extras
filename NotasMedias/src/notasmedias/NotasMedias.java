/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasmedias;

import java.util.Scanner;

/**
 *
 * @author palonsovazquez
 */
public class NotasMedias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Boolean salida = false;
        Integer contador = 0;
        Double res;
        Double acumuladorTeor = 0d, acumuladorPractico = 0d, boletinTotal = 0d, boletinBien, porcentajeBien, puntosBoletin, notaTotal = 0d, notaMedPract, notaMedTeor;
        
        do{
            
            
        
        do {
            res = Peticiones.pedirNumeroDouble("una nota teorica", 0d, 10d);
            acumuladorTeor += res;
            if (res != 0) {
                contador++;
            }

        } while (res != 0);
        notaMedTeor = acumuladorTeor / contador;
        contador = 0;

        do {
            res = Peticiones.pedirNumeroDouble("una nota Practica", 0d, 10d);
            acumuladorPractico += res;
            if (res != 0) {
                contador++;
            }

        } while (res != 0);

        notaMedPract = acumuladorPractico / contador;
        contador = 0;
        do{
        boletinTotal = Peticiones.pedirNumDoubleFiltrado("el numero de boletines totales", Peticiones.POSITIVO);
        boletinBien = Peticiones.pedirNumDoubleFiltrado("el numero de boletines correctos", Peticiones.CERO_POSITIVO);
        }while(boletinBien>= boletinTotal);
        porcentajeBien = boletinBien / boletinTotal;

        if (porcentajeBien > 0.9) {
            puntosBoletin = 2d;
        } else {
            if (porcentajeBien > 0.7) {
                puntosBoletin = 1d;
            } else {
                puntosBoletin = 0d;
            }
        }
        System.out.println(notaMedPract + " y " + notaMedTeor);

        notaTotal = (notaMedTeor * 0.4) + notaMedPract * 0.4 + puntosBoletin;

        System.out.println("la nota final es: " + notaTotal);
            System.out.println("Quieres continuar? S/N");
            
            switch(sca.nextLine()){
                case "S":
                case "s":
                case "Si":
                case " SI":
                    salida = true;
                    
            
            }
        

    }while (salida == false);
        
        }

}
