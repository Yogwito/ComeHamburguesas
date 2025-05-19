/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.*;

/**
 * 
 * @author Juans & Trujirendjj
 */
public class GestorPuntaje {

    /** Nombre del archivo donde se guarda el puntaje máximo. */
    private static final String ARCHIVO = "puntaje_maximo.txt";

    /**
     * Carga el puntaje máximo desde el archivo.
     * 
     * @return el puntaje máximo guardado. Si no se puede leer el archivo o ocurre un error, retorna 0.
     */
    public static int cargarPuntajeMaximo() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            return Integer.parseInt(br.readLine().trim());
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * Guarda el puntaje máximo en el archivo.
     * 
     * @param puntaje el puntaje que se desea guardar.
     */
    public static void guardarPuntajeMaximo(int puntaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            bw.write(String.valueOf(puntaje));
        } catch (IOException e) {
            System.out.println("Error guardando puntaje: " + e.getMessage());
        }
    }
}
