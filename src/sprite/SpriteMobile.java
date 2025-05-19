/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprite;

/**
 * @author Juans & Trujirendjj
 */
public abstract class SpriteMobile extends Sprite {

    /**
     * Constructor que inicializa la posición y tamaño del sprite móvil.
     * 
     * @param x      posición X inicial.
     * @param y      posición Y inicial.
     * @param width  ancho del sprite.
     * @param height alto del sprite.
     */
    public SpriteMobile(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    
    /**
     * Mueve el sprite hacia abajo incrementando su coordenada Y según la velocidad dada.
     * 
     * @param velocidad la cantidad de píxeles que se mueve hacia abajo.
     */
    public void moverHaciaAbajo(int velocidad) {
        this.y += velocidad;
    }
}
