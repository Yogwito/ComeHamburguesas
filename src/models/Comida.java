/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

import sprite.SpriteMobile;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * 
 * @author Juans & Trujirendjj
 */
public class Comida extends SpriteMobile {

    /** Imagen que representa visualmente el objeto de comida. */
    private Image imagen;

    /**
     * Crea una nueva instancia de {@code Comida} con posición y tamaño especificados.
     *
     * @param x      la posición X del objeto.
     * @param y      la posición Y del objeto.
     * @param width  el ancho del objeto.
     * @param height la altura del objeto.
     */
    public Comida(int x, int y, int width, int height) {
        super(x, y, width, height);
        imagen = new ImageIcon(getClass().getResource("/resources/Food.png")).getImage();
    }

    /**
     * Verifica si este objeto de comida ha colisionado con otro objeto del juego.
     * Actualmente no implementa ninguna lógica específica.
     */
    @Override
    public void checkCollision() {
        // TODO: colisión con jugador
    }

    /**
     * Dibuja la imagen de la comida en el contexto gráfico proporcionado.
     *
     * @param g el contexto gráfico en el cual se dibujará la imagen.
     */
    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, x, y, width, height, null);
    }
}
