/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprite;

import java.awt.Graphics;

/**
 * 
 * @author Juans & Trujirendjj
 */
public abstract class Sprite {
    /** Posición horizontal del sprite. */
    protected int x;
    
    /** Posición vertical del sprite. */
    protected int y;
    
    /** Ancho del sprite. */
    protected int width;
    
    /** Alto del sprite. */
    protected int height;

    /**
     * Constructor que inicializa la posición y tamaño del sprite.
     * 
     * @param x      posición X inicial.
     * @param y      posición Y inicial.
     * @param width  ancho del sprite.
     * @param height alto del sprite.
     */
    public Sprite(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    /** @return la posición X del sprite. */
    public int getX() { return x; }
    
    /** @return la posición Y del sprite. */
    public int getY() { return y; }
    
    /** @return el ancho del sprite. */
    public int getWidth() { return width; }
    
    /** @return el alto del sprite. */
    public int getHeight() { return height; }

    /**
     * Método abstracto para verificar colisiones con otros elementos del juego.
     * Las subclases deben implementar la lógica específica.
     */
    public abstract void checkCollision();

    /**
     * Método abstracto para dibujar el sprite en el contexto gráfico proporcionado.
     * 
     * @param g el contexto gráfico donde se realizará el dibujo.
     */
    public abstract void paint(Graphics g);
}
