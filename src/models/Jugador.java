/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import sprite.Sprite;
import java.awt.Graphics;
import java.awt.Color;

/**
 * La clase {@code Jugador} representa al personaje controlado por el usuario en el juego.
 * Es una subclase de {@link Sprite} y se dibuja como un rectángulo azul.
 * 
 * En el futuro, puede incluir lógica para colisiones con otros elementos como comida o veneno.
 * 
 * @author Juans & Trujirendjj
 */
public class Jugador extends Sprite {

    /**
     * Crea una nueva instancia del jugador con posición y tamaño especificados.
     *
     * @param x      posición X del jugador.
     * @param y      posición Y del jugador.
     * @param width  ancho del jugador.
     * @param height alto del jugador.
     */
    public Jugador(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    /**
     * Método destinado a verificar colisiones con otros elementos del juego.
     * Actualmente no implementa ninguna lógica.
     */
    @Override
    public void checkCollision() {
        // TODO: colisión con comida o veneno
    }

    /**
     * Dibuja al jugador como un rectángulo azul en el contexto gráfico proporcionado.
     *
     * @param g el contexto gráfico en el que se dibuja el jugador.
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
}
