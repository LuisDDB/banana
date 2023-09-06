/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.banana.datos;

import java.util.Scanner;

/**
 *
 * @author alumnog
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el texto");
        String tex = sc.nextLine();

        String[] textoFinal = new Operacion().separar(tex);


     
        for (String a : textoFinal) {

          String[]  datosSeparados = new Operacion().identificar(a);
            System.out.println("ID: "+datosSeparados[0]+". Nombre: "+datosSeparados[3]+". Apellido: "+ datosSeparados[1]+".");

        }
       

    }

}
