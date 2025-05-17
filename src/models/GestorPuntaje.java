/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.io.*;

/**
 *
 * @author juans
 */

public class GestorPuntaje {

    private static final String ARCHIVO = "puntaje_maximo.txt";

    public static int cargarPuntajeMaximo() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            return Integer.parseInt(br.readLine().trim());
        } catch (Exception e) {
            return 0;
        }
    }

    public static void guardarPuntajeMaximo(int puntaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            bw.write(String.valueOf(puntaje));
        } catch (IOException e) {
            System.out.println("Error guardando puntaje: " + e.getMessage());
        }
    }
}
