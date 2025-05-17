/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import sprite.*;
/**
 *
 * @author juans
 */

import sprite.Sprite;
import java.awt.Graphics;
import java.awt.Color;

public class Jugador extends Sprite {
    public Jugador(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void checkCollision() {
        // TODO: colisión con comida o veneno
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
}
