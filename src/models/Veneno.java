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
public class Veneno extends SpriteMobile {

    /** Imagen que representa visualmente el objeto de veneno. */
    private Image imagen;

    /**
     * Crea una nueva instancia de {@code Veneno} con posición y tamaño definidos.
     *
     * @param x      posición X del objeto veneno.
     * @param y      posición Y del objeto veneno.
     * @param width  ancho del objeto.
     * @param height alto del objeto.
     */
    public Veneno(int x, int y, int width, int height) {
        super(x, y, width, height);
        imagen = new ImageIcon(getClass().getResource("/resources/Venom.png")).getImage();
    }

    /**
     * Verifica si el objeto ha colisionado con otro elemento del juego.
     * Actualmente no implementa lógica específica.
     */
    @Override
    public void checkCollision() {
        // TODO: colisión con jugador
    }

    /**
     * Dibuja la imagen del veneno en el contexto gráfico proporcionado.
     *
     * @param g el contexto gráfico donde se dibuja el veneno.
     */
    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, x, y, width, height, null);
    }
}
