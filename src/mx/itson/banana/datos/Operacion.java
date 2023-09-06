/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.banana.datos;

/**
 *
 * @author alumnog
 */
public class Operacion {

    public String[] separar(String texto) {
        String[] nombreId = texto.split(",");
        return nombreId;

    }

    public String[] identificar(String datos) {
        String[] conjuntoDatos = datos.split(" ");
        return conjuntoDatos;

    }
}
