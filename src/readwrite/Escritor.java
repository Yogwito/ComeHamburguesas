/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readwrite;

/**
 * 
 * @author Juans & Trujirendjj
 */
public interface Escritor {

    /**
     * Escribe contenido en un archivo ubicado en la ruta especificada.
     *
     * @param ruta     la ruta del archivo donde se escribirá el contenido.
     * @param contenido el texto que se desea escribir en el archivo.
     */
    void escribirArchivo(String ruta, String contenido);
}
